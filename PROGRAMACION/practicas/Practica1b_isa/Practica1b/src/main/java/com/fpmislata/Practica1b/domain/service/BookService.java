package com.fpmislata.Practica1b.domain.service;

import com.fpmislata.Practica1b.domain.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAll();
    public Book findById(int id);
    public Book addBook(Book book);
}
