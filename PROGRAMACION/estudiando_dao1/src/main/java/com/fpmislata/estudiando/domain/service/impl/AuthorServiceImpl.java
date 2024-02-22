package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.service.AuthorService;
import com.fpmislata.estudiando.persistence.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    //AuthorRepository repository = new AuthorRepositoryImpl();
    private final AuthorRepository repository;

    public AuthorServiceImpl(AuthorRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Author> findAll() {
        return this.repository.findAll();
    }
}
