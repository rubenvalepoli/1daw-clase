package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

import java.util.List;

public interface DirectorDao {

    public List<DirectorEntity> getAll();

    public DirectorEntity findById(int id);
}
