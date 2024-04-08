package com.fpmislata.examen2.persistence.repository;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {

    public List<Movie> getAll();
    public Movie findById(int id);

    public Director findIdDirector(int id);

}
