package com.fpmislata.books.domain.service;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.Editorial;

import java.util.List;

public interface BookService {

    public List<Book> findAll();
    public Book findBookById(int id);
    public void deleteBook(int id);
    public void update(Integer id, String name, Integer year);
    //public void update(Integer id, String name, Integer year, Editorial editorialId, List<String> charactersList);

}
