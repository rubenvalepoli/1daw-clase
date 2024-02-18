package com.fpmislata.estudiando.domain.service;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;

import java.util.List;

public interface BooksService {

    public List<Book> findall();

    public Book findById (int id);


/*
    void insert(Book book, Integer authorID);
*/
}
