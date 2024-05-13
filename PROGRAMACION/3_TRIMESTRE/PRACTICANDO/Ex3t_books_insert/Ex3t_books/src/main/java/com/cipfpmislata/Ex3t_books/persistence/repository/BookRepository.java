package com.cipfpmislata.Ex3t_books.persistence.repository;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;

import java.util.List;

public interface BookRepository {

    Books findById(Integer id);

    List<Books> findAll();

    List<Books> findAllByTitle(String title);

    List<Books> findAllByYear(Integer year);
    void insert(Books books);

    void update(Books books);

    void delete(Integer id);
}
