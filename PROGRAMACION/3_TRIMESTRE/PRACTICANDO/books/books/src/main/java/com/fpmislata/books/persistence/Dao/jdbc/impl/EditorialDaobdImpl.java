package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.persistence.Dao.EditorialDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.BookMapper;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.EditorialMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EditorialDaobdImpl implements EditorialDao {


    @Override
    public List<Editorial> findAll(){
        try {
            List<Editorial> editorialList = new ArrayList<>();
            ResultSet resultSet = Rawsql.select("select * from editorial;",null );

            while (resultSet.next()){
                editorialList.add(EditorialMapper.toEditorial(resultSet));
            }
            return editorialList;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(Editorial editorial) {
        String sql = "INSERT INTO editorial (id, name) VALUES(?,?)";
        List<Object> editorialId = List.of(editorial.getId(),editorial.getName());
        Rawsql.insert(sql,editorialId,false);
    }

}
