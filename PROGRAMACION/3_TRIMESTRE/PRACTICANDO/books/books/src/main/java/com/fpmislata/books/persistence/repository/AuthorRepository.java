package com.fpmislata.books.persistence.repository;

import com.fpmislata.books.domain.entity.Author;
import com.fpmislata.books.persistence.Dao.AuthorDao;

public interface AuthorRepository {

    public Author findByAuthorId(int id);
}
