package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    List<Book> bookEntityList = new ArrayList<>();


    public BookDaoImpl(){
        this.bookEntityList.add(new Book(1,"El Quijote", new Author(1,"Cervantes")));
        this.bookEntityList.add(new Book(2,"Sancho Panza", new Author(2, "Pepe")));
        this.bookEntityList.add(new Book(3,"Panzeta", new Author(3, "Paco")));
    }


    @Override
    public List<Book> findall() {
        return null;
    }
}
