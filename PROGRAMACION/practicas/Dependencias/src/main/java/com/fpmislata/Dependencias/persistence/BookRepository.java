package com.fpmislata.Dependencias.persistence;

import com.fpmislata.Dependencias.domine.entity.Book;

import java.util.List;

public interface BookRepository {
    public List<Book> all();
    public Book findById(int id);

    public Book create(String title, String author);
}
