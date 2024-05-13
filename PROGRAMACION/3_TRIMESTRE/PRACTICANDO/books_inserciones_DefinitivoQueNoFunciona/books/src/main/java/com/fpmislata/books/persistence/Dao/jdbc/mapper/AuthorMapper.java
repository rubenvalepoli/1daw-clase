package com.fpmislata.books.persistence.Dao.jdbc.mapper;

import com.fpmislata.books.domain.entity.Author;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorMapper {

    public static Author toAuthor(ResultSet resultSet){
        if (resultSet == null){
            return null;
        }
        try {
            return new Author(
                    resultSet.getInt("id"),
                    resultSet.getString("name")
            );
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
