package com.fpmislata.books.persistence.repository.impl;

import com.fpmislata.books.domain.entity.Author;
import com.fpmislata.books.persistence.Dao.AuthorDao;
import com.fpmislata.books.persistence.repository.AuthorRepository;

public class AuthorRepositoryImpl implements AuthorRepository {
    private AuthorDao authorDao;

    public AuthorRepositoryImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author findByAuthorId(int id) {
        Author author = authorDao.findByAuthorId(id);
        return author;
    }
}
