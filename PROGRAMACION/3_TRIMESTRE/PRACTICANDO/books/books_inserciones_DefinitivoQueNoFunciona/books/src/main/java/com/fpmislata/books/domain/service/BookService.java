package com.fpmislata.books.domain.service;

import com.fpmislata.books.domain.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();
    public Book findBookById(int id);
    public void deleteBook(int id);
    public void create (String title, String editorialName, List<String> characterNameMovieList, int year);
}
