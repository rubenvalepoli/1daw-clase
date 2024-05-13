package com.cipfpmislata.Ex3t_books.persistence.dao.mapper;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorMapper {
    public static Author toAuthor(ResultSet resultSet) {
        if (resultSet == null) {
            return null;
        }
        try {
            //nombres de las columnas en la bbdd
            return new Author(resultSet.getInt("id"),
                    resultSet.getString("name"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Author> toAuthorList(ResultSet resultSet) {
        try {
            List<Author> authorList = new ArrayList<>();
            while (resultSet.next()) {
                authorList.add(toAuthor(resultSet));
            }
            return authorList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
