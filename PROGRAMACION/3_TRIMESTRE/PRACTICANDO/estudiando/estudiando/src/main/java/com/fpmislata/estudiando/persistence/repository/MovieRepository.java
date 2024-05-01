package com.fpmislata.estudiando.persistence.repository;

import com.fpmislata.estudiando.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {

    public List<Movie> getAll();
    public Movie findById(int id);

    void insert(Movie movie);

}
