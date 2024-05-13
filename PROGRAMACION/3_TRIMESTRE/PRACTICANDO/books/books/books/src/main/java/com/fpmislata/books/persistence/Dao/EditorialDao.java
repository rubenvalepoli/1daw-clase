package com.fpmislata.books.persistence.Dao;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.entity.Editorial;

import java.util.List;

public interface EditorialDao {
    public List<Editorial> findAll();

    public void insert(Editorial editorial);
    public CharacterMovie findByName(String name);
}
