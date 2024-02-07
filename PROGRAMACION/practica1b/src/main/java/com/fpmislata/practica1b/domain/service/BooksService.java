package com.fpmislata.practica1b.domain.service;

import com.fpmislata.practica1b.domain.entity.Book;

import java.util.List;

public interface BooksService {

    public List<Book> getAll();
    public Book findById(int id);
    public Book create(String title, String author);
}
