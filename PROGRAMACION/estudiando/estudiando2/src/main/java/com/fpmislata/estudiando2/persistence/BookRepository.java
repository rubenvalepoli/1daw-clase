package com.fpmislata.estudiando2.persistence;

import com.fpmislata.estudiando2.domine.entity.Book;

import java.util.List;

public interface BookRepository {

    public List<Book> all();

    public Integer dobleid(Integer id, Integer dobleid);

    public Book id(Integer id);

    public Book createbook(Book book);
}
