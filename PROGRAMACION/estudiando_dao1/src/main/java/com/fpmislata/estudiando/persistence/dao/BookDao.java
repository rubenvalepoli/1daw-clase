package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.entity.BookEntity;

import java.util.List;

public interface BookDao {

    public List<BookEntity> findAll();

    public BookEntity findById(int id);

    public BookEntity addBook(BookEntity book);

}
