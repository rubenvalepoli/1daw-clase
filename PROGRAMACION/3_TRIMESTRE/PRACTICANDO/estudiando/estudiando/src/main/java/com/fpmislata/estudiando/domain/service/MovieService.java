package com.fpmislata.estudiando.domain.service;

import com.fpmislata.estudiando.domain.entity.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> getAll();

    public Movie findById(int id);

    public void insert(Movie movie);
}
