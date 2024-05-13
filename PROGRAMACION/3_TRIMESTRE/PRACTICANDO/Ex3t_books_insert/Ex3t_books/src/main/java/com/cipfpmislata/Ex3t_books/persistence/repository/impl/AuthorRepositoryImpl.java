package com.cipfpmislata.Ex3t_books.persistence.repository.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;
import com.cipfpmislata.Ex3t_books.persistence.dao.AuthorDao;
import com.cipfpmislata.Ex3t_books.persistence.repository.AuthorRepository;

import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {
    AuthorDao authorDao;

    public AuthorRepositoryImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author findById(Integer id) {
        return authorDao.findById(id);
    }
    @Override
    public List<Author> findAll() {
        return authorDao.findAll();
    }
    @Override
    public Author findByName(String name) {
        return authorDao.findByName(name);
    }


}
