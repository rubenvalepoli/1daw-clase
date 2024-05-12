package com.cipfpmislata.Ex3t_books.persistence.repository;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;

import java.util.List;

public interface EditorialRepository {
    public Editorial findById(Integer Id);
    public List<Editorial> findAll();
    public void delete(Integer Id);
    public void insert(Editorial editorial);
}
