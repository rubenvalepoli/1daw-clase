package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.service.AuthorService;
import com.fpmislata.estudiando.persistence.impl.AuthorRepositoryImpl;
import com.fpmislata.estudiando.persistence.impl.BookRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {


    AuthorRepositoryImpl repository = new AuthorRepositoryImpl();

    @Override
    public List<Author> findAll() {
        return this.repository.findAll();
    }
}
