package com.fpmislata.estudiando2.domine.service.impl;

import com.fpmislata.estudiando2.domine.entity.Book;
import com.fpmislata.estudiando2.domine.service.BooksService;
import com.fpmislata.estudiando2.persistence.BookRepository;
import com.fpmislata.estudiando2.persistence.impl.BookRepositoryImpl;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    private BookRepository repository = new BookRepositoryImpl();
    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }

    @Override
    public Integer dobleid(Integer id, Integer dobleid) {
        return dobleid;
    }


    @Override
    public Book findById(Integer id) {
        return this.repository.id(id);
    }

    @Override
    public Book createbook(Book book) {
        return this.repository.createbook(book);
    }
}
