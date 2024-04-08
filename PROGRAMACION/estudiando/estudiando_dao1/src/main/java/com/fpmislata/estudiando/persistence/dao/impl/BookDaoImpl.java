package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.BookDao;
import com.fpmislata.estudiando.persistence.dao.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    List<BookEntity> bookEntityList = new ArrayList<>();


    public BookDaoImpl(){
        this.bookEntityList.add(new BookEntity(1,"El Quijote"));
        this.bookEntityList.add(new BookEntity(2,"Sancho Panza"));
        this.bookEntityList.add(new BookEntity(3,"Panzeta"));
    }




    @Override
    public List<BookEntity> findAll() {
        return bookEntityList;
    }

    @Override
    public BookEntity findById(int id) {
        for (BookEntity book : bookEntityList){
            if (book.getId() == id){
                return book;
            }
        }
        return null;
    }

    @Override
    public BookEntity addBook(BookEntity book) {
        return null;
    }
}
