package com.fpmislata.estudiando2.domine.service;

import com.fpmislata.estudiando2.domine.entity.Book;

import java.util.List;

public interface BooksService {
    public List<Book> getAll();

    public Integer dobleid(Integer id, Integer dobleid);

    public Book findById(Integer id);
    public Book createbook(Book book);

}
