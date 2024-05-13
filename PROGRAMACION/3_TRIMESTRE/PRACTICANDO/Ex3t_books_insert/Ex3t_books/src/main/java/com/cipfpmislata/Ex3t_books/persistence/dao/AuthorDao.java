package com.cipfpmislata.Ex3t_books.persistence.dao;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;

import java.util.List;

public interface AuthorDao {
    Author findById(Integer id);

    Author findByName(String name);

    List<Author> findAll();


}
