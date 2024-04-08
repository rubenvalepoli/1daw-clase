package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.persistence.dao.entity.AuthorEntity;

import java.util.List;

public interface AuthorDao {
    public List<AuthorEntity> findAll();

}
