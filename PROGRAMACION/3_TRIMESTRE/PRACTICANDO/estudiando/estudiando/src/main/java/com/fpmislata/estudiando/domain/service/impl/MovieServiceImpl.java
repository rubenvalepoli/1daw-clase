package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.domain.service.MovieService;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;
import com.fpmislata.estudiando.persistence.repository.impl.MovieRepositoryImpl;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository = new MovieRepositoryImpl();

    @Override
    public List<Movie> getAll() {
        return movieRepository.getAll();
    }

    @Override
    public Movie findById(int id){
        return movieRepository.findById(id);
    }
}
