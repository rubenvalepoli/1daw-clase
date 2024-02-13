package com.fpmislata.Dependencias.domine.service.impl;

import com.fpmislata.Dependencias.domine.entity.Book;
import com.fpmislata.Dependencias.domine.service.BookService;
import com.fpmislata.Dependencias.persistence.BookRepository;
import com.fpmislata.Dependencias.persistence.impl.StaticBookRepositoryImpl;

import java.util.List;

public class BooksServiceImpl implements BookService {

    private BookRepository repository = new StaticBookRepositoyImpl();


    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }

    @Override
    public Book findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public Book create(String title, String author) {
        return this.repository.create(title, author);
    }


}
