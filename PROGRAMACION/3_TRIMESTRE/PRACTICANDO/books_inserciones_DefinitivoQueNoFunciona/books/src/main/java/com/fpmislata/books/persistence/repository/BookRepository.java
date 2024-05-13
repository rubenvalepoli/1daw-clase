package com.fpmislata.books.persistence.repository;

import com.fpmislata.books.domain.entity.Book;

import java.util.List;

public interface BookRepository {
    public List<Book> findAll();
    public Book findBookById(int id);
    public void deleteBook(int id);
    public void create(Book book);


}
