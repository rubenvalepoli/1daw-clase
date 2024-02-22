package com.fpmislata.estudiando.persistence.repository;


import com.fpmislata.estudiando.domain.entity.Book;

import java.util.List;

public interface BookRepository {

    public List<Book> findAll();

    public Book findById(int id);

    public Book addBook(Book book);
}
