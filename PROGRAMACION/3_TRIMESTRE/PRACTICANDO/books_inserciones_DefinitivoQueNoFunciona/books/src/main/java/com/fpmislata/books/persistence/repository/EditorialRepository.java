package com.fpmislata.books.persistence.repository;

import com.fpmislata.books.domain.entity.Editorial;

import java.util.List;

public interface EditorialRepository {
    public List<Editorial> findAll();
    public void insert(Editorial editorial);
    public Editorial findEditorialByName (String name);
}
