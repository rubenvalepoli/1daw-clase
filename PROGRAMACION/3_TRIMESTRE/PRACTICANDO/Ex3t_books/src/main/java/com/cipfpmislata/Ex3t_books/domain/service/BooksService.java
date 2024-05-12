package com.cipfpmislata.Ex3t_books.domain.service;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;

import java.util.List;

public interface BooksService {

    Books findById(Integer id);

    List<Books> findAll();

    List<Books> findAllByName(String name);
    List<Books> findAllByCharacterName(String name);

    List<Books> findAllByYear(Integer year);
    void insert(Books books);

    void update(Books books);

    void delete(Integer id);
}
