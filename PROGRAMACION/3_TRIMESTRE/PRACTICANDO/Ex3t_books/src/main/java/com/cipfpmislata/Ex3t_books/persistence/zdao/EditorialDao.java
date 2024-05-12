package com.cipfpmislata.Ex3t_books.persistence.zdao;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;

import java.util.List;

public interface EditorialDao {
    public Editorial findById(Integer Id);
    public List<Editorial> findAll();
    public void delete(Integer Id);
    public void insert(Editorial editorial);
}
