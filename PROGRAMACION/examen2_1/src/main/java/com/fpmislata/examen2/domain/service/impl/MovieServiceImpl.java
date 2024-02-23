package com.fpmislata.examen2.domain.service.impl;

import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.impl.MovieRepositoryImpl;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    MovieRepository movieRepository;

    @Override
    public List<Movie> getAll() {
        return this.movieRepository.getAll();
    }
}
