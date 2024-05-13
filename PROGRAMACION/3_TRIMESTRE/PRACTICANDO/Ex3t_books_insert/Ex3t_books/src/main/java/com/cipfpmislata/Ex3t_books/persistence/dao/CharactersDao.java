package com.cipfpmislata.Ex3t_books.persistence.dao;

import com.cipfpmislata.Ex3t_books.domain.entity.Characters;

import java.util.List;

public interface CharactersDao {

    public List<Characters> findAll();
    public Characters findById(Integer id);
    public List<Characters> findByBook(Integer bookId);
}
