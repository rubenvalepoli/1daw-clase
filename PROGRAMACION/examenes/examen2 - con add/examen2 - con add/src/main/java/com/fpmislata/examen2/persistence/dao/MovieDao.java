package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

import java.util.List;

public interface MovieDao {

    public List<MovieEntity> getAll();

    public MovieEntity findById(Integer id);

    public void insert(MovieEntity movieEntity);
    public void delete(Integer id);
}
