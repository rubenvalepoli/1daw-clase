package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.persistence.Dao.EditorialDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.CharacterMovieMapper;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.EditorialMapper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EditorialDaoBdImpl implements EditorialDao {

    @Override
    public List<Editorial> findAll(){
            List<Editorial> editorialList = new ArrayList<>();
            ResultSet resultSet = Rawsql.select("select id, name from editorial;",null );
//            try{
//                resultSet.next();
//            } catch (SQLException e){
//                throw new RuntimeException();
//            }
            editorialList = EditorialMapper.toEditorialList(resultSet);
            return editorialList;
    }

    @Override
    public void insert(Editorial editorial){
        String sql = "INSERT INTO editorial (id, name) VALUES (?, ?);";
        List<Object> listEditorialId = List.of(editorial.getId(), editorial.getName());
        Rawsql.insert(sql,listEditorialId, false);
    }



    @Override
    public CharacterMovie findByName(String name) {

        List<Object> params = List.of(name);

        String sql = "SELECT * FROM 'editorial' WHERE name = ?";

        return CharacterMovieMapper.toCharacterMovie(Rawsql.select(sql,params));
    }
}
