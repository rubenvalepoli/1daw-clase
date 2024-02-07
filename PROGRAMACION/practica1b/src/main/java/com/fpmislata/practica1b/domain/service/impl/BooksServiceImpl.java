package com.fpmislata.practica1b.domain.service.impl;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.BooksService;
import com.fpmislata.practica1b.persistence.BookRepository;
import com.fpmislata.practica1b.persistence.impl.StaticBookRepositoyImpl;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    private BookRepository repository = new StaticBookRepositoyImpl();


    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }



}
