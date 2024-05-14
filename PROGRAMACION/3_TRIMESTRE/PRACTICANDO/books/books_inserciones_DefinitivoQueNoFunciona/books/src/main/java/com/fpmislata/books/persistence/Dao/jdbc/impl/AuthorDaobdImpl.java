package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.domain.entity.Author;
import com.fpmislata.books.persistence.Dao.AuthorDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.AuthorMapper;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.BookMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class AuthorDaobdImpl implements AuthorDao {

    @Override
    public Author findByAuthorId(int id){
        List<Object> listAuthorId = List.of(id);
        ResultSet resultSet = Rawsql.select("select * from author where id = ?;",listAuthorId);

        try {
            resultSet.next();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return AuthorMapper.toAuthor(resultSet);
    }
}
