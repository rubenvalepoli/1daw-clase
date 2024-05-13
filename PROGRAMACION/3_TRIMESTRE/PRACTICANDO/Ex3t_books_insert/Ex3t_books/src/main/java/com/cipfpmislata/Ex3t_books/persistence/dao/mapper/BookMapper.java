package com.cipfpmislata.Ex3t_books.persistence.dao.mapper;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;
import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper {
    public static Books toBooks(ResultSet resultSet) {
        if (resultSet == null) {
            return null;
        }
        try {
            //nombres de las columnas en la bbdd
            return new Books(resultSet.getInt("id"),
                    resultSet.getString("title"),
                    resultSet.getInt("year"),
                    new Editorial(resultSet.getInt("editorial_id")),
                    new Author(resultSet.getInt("author_id")));
        } catch (SQLException e) {
            throw new RuntimeException("Error al encontrar el libro", e);
        }
    }

    public static List<Books> toBookList(ResultSet resultSet) {
        try {
            List<Books> booksList = new ArrayList<>();
            while (resultSet.next()) {
                booksList.add(toBooks(resultSet));
            }
            return booksList;
        } catch (SQLException e) {
            throw new RuntimeException("Error al encontrar los libros", e);
        }
    }
}
