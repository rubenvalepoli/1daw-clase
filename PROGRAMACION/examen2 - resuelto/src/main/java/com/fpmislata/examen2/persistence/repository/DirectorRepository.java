package com.fpmislata.examen2.persistence.repository;

import com.fpmislata.examen2.domain.entity.Director;

import java.util.List;

public interface DirectorRepository {

    public List<Director> getAll();
    public Director findById(Integer id);

}
