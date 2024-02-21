package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.domain.entity.Book;

import java.util.List;

public interface BookDao {

    public List<Book> findall();

}
