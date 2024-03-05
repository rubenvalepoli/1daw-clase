package com.fpmislata.examen2.domain.service;

import com.fpmislata.examen2.domain.entity.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> getAll();
    public Movie findById(Integer id);
    void insert(Movie movie);
}
