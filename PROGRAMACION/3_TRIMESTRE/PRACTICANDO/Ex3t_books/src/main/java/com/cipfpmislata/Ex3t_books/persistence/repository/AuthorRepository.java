package com.cipfpmislata.Ex3t_books.persistence.repository;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;

import java.util.List;

public interface AuthorRepository {
    Author findById(Integer id);

    Author findByName(String name);

    List<Author> findAll();


}
