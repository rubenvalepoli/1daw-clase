package com.fpmislata.estudiando.persistence.repository;

import com.fpmislata.estudiando.domain.entity.Movie;

import java.sql.SQLException;
import java.util.List;

public interface MovieRepository {

    public List<Movie> getAll();
    public Movie findById(int id) throws SQLException;

    void insert(Movie movie);

}
