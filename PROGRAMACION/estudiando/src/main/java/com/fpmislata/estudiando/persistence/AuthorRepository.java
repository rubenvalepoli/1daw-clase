package com.fpmislata.estudiando.persistence;

import com.fpmislata.estudiando.domain.entity.Author;

import java.util.List;

public interface AuthorRepository {

    public List<Author> findAll();
}
