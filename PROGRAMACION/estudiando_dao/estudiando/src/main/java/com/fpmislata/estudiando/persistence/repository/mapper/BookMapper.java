package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public static Book toBook(BookEntity bookEntity){
        if (bookEntity == null){
            return null;
        }
        return new Book(
                bookEntity.getId(),
                bookEntity.getTitle()
        );
    }

    public static List<Book> toBooklist(List<BookEntity> bookEntityList){
        List<Book> bookList = new ArrayList<>();
        for (BookEntity bookEntity: bookEntityList){
            bookList.add(toBook(bookEntity));
        }
        return bookList;
    }

}
