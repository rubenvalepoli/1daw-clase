package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.domain.service.BooksService;
import com.fpmislata.estudiando.persistence.impl.BookRepositoryImpl;

import java.util.List;

public class BooksServiceImpl implements BooksService{

    private BookRepositoryImpl repository = new BookRepositoryImpl();
    @Override
    public List<Book> findall() {
        return this.repository.findall();
    }

    @Override
    public Book findById(int id) {
        return this.repository.findById(id);
    }
}
