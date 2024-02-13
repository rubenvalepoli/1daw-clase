package com.fpmislata.Dependencias.domine.service;

import com.fpmislata.Dependencias.domine.entity.Book;

import java.util.List;

public interface BookService {


    public List<Book> getAll();
    public Book findById(int id);
    public Book create(String title, String author);
}
