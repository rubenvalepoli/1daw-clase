package com.fpmislata.Practica1b.domain.service.impl;

import com.fpmislata.Practica1b.domain.entity.Author;
import com.fpmislata.Practica1b.domain.service.AuthorService;
import com.fpmislata.Practica1b.persistence.AuthorRepository;
import com.fpmislata.Practica1b.persistence.impl.AuthorRepositoryImpl;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    AuthorRepository repository = new AuthorRepositoryImpl();

    @Override
    public List<Author> all() {
        return this.repository.all();
    }
}
