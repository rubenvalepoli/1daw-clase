package com.fpmislata.estudiando.domain.service;

import com.fpmislata.estudiando.domain.entity.Book;

import java.util.List;

public interface BooksService {

    public List<Book> findall();

    public Book findById (int id);
}
