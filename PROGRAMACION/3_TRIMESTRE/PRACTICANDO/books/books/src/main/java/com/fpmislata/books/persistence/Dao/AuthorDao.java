package com.fpmislata.books.persistence.Dao;

import com.fpmislata.books.domain.entity.Author;

public interface AuthorDao {

    public Author findByAuthorId(int id);
}
