package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.domain.entity.Director;

import java.util.List;

public interface DirectorDao {

    public Director findByDirectorId(int id);

    public List<Director> getAll();

}
