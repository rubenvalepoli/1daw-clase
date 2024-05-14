package com.fpmislata.books.persistence.Dao.jdbc.mapper;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.entity.Editorial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public static Book toBook(ResultSet resultSet){

        if (resultSet == null){
            return null;
        }

        try {
            return new Book(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("year"),
                    new Editorial(resultSet.getInt("editorial_id"))
            );
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static List<Book> toBookList(ResultSet resultSet){
        try {
            List<Book> bookList = new ArrayList<>();
            while (resultSet.next()){
                bookList.add(toBook(resultSet));
            }
            return bookList;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Book toBookOnlyId(ResultSet resultSet){

        if (resultSet == null){
            return null;
        }
        try {
            return new Book(
                    resultSet.getInt("id")
            );
        } catch (SQLException e){
            throw new RuntimeException("Error al mapear el libro", e);
        }
    }
}
