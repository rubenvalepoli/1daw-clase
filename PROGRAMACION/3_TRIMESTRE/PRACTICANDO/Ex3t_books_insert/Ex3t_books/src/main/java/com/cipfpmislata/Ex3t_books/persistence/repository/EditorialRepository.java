package com.cipfpmislata.Ex3t_books.persistence.repository;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;

import java.util.List;

public interface EditorialRepository {
    public Editorial findById(Integer id);
    public List<Editorial> findAll();
    public void delete(Integer id);
    public void insert(Editorial editorial);
}
