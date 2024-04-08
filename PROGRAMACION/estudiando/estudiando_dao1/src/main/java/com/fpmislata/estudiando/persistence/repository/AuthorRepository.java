package com.fpmislata.estudiando.persistence.repository;

import com.fpmislata.estudiando.domain.entity.Author;

import java.util.List;


public interface AuthorRepository {

    public List<Author> findAll();
}
