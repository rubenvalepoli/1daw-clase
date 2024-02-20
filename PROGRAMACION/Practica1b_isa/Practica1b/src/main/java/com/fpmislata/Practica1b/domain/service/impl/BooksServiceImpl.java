package com.fpmislata.Practica1b.domain.service.impl;

import com.fpmislata.Practica1b.domain.entity.Book;
import com.fpmislata.Practica1b.domain.service.BookService;
import com.fpmislata.Practica1b.persistence.BookRepository;
import com.fpmislata.Practica1b.persistence.impl.StaticBookRepositoryImpl;

import java.util.List;

public class BooksServiceImpl implements BookService {
    private BookRepository repository;

    public BooksServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }

    @Override
    public Book findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public Book addBook(Book book) {
        return this.repository.addBook(book);
    }

}
