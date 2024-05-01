package com.fpmislata.estudiando.persistence.repository;

import com.fpmislata.estudiando.domain.entity.Director;

import java.util.List;

public interface DirectorRepository {

    public List<Director> getAll();
    public Director findById(Integer id);

}
