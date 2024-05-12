package com.fpmislata.books.persistence.Dao.jdbc.mapper;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.Editorial;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EditorialMapper {

    public static Editorial toEditorial(ResultSet resultSet){

        if (resultSet == null){
            return null;
        }

        try {
            return new Editorial(
                    resultSet.getInt("id"),
                    resultSet.getString("name")
            );
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
