package com.fpmislata.practica1b.persistence;

import com.fpmislata.practica1b.domain.entity.Book;

import java.util.List;

public interface BookRepository {

    public List<Book> all();
    public Book findById(int id);

    public Book create(String title, String author);
}
