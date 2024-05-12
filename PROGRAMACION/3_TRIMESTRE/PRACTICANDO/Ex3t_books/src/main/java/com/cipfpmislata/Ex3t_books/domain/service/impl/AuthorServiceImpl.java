package com.cipfpmislata.Ex3t_books.domain.service.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;
import com.cipfpmislata.Ex3t_books.domain.service.AuthorService;
import com.cipfpmislata.Ex3t_books.persistence.repository.AuthorRepository;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {
    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findById(Integer id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author findByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
