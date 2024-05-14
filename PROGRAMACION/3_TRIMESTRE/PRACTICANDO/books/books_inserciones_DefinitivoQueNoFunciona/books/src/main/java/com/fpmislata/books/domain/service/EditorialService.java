package com.fpmislata.books.domain.service;

import com.fpmislata.books.domain.entity.Editorial;

import java.util.List;

public interface EditorialService {
    public List<Editorial> findAll();
    public void insert(Editorial editorial);
    public Editorial findEditorialByName (String name);
}
