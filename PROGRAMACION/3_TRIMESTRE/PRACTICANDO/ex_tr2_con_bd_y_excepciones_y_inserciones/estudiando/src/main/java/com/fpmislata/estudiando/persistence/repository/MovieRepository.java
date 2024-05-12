package com.fpmislata.estudiando.persistence.repository;

import com.fpmislata.estudiando.domain.entity.Movie;

import java.sql.SQLException;
import java.util.List;

public interface MovieRepository {

    public List<Movie> getAll();
    public Movie findByMovieId(int id) throws SQLException;
    public void deleteMovie(int id);
    public void deleteCharacterMovie (int id);
    void insert(Movie movie);

}
