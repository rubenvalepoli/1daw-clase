package com.cipfpmislata.Ex3t_books.persistence.zdao;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;

import java.util.List;

public interface BooksDao {

    Books findById(Integer id);

    List<Books> findAll();

    List<Books> findAllByName(String title);
    List<Books> findAllByCharacterName(String name);

    List<Books> findAllByYear(Integer year);
    void insert(Books books);

    void update(Books books);

    void delete(Integer id);
}