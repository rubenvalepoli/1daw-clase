package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

import java.util.List;

public interface DirectorDao {

    public DirectorEntity findById(Integer id);
    public List<DirectorEntity> getAll();
}

