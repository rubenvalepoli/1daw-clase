package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;

import java.util.List;

public interface DirectorDao {

    public DirectorEntity findByDirectorId(int id);

    public List<DirectorEntity> getAll();

}
