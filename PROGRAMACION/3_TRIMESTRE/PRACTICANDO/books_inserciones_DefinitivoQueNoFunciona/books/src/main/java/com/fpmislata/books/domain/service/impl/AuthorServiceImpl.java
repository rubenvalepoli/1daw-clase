package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.domain.entity.Author;
import com.fpmislata.books.domain.service.AuthorService;
import com.fpmislata.books.persistence.repository.AuthorRepository;

public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findByAuthorId(int id) {

        try {
            return authorRepository.findByAuthorId(id);
        } catch (Exception e){
            throw new RuntimeException("Autor no encontrado");
        }

    }
}
