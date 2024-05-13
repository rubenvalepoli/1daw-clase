package com.cipfpmislata.Ex3t_books.domain.service;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;

import java.util.List;

public interface EditorialService {
    public Editorial findById(Integer id);
    public List<Editorial> findAll();
    public void delete(Integer id);
    public void insert(Editorial editorial);
}
