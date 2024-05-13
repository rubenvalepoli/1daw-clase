package com.fpmislata.books.persistence.Dao;

import com.fpmislata.books.domain.entity.Book;

import java.util.List;

public interface BookDao {

    public List<Book> findAll();
    public Book findBookById(int id);
    public void deleteBook(int id);
    public void update(Book book);

}
