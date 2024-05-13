package com.fpmislata.books.persistence.Dao.jdbc.mapper;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.Editorial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Editorial> toEditorialList(ResultSet resultSet){
        try {
            List<Editorial> editorialList = new ArrayList<>();
            while (resultSet.next()){
                editorialList.add(toEditorial(resultSet));
            }
            return editorialList;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
