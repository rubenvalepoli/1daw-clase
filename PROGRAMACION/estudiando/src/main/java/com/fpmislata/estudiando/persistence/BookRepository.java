package com.fpmislata.estudiando.persistence;


import com.fpmislata.estudiando.domain.entity.Book;

import java.util.List;

public interface BookRepository {

    public List<Book> findall();

    public Book findById(int id);


}
