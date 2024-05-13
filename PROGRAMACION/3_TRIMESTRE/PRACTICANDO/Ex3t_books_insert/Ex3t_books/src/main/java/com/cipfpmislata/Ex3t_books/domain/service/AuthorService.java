package com.cipfpmislata.Ex3t_books.domain.service;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;

import java.util.List;

public interface AuthorService {
    Author findById(Integer id);

    Author findByName(String name);

    List<Author> findAll();

}
