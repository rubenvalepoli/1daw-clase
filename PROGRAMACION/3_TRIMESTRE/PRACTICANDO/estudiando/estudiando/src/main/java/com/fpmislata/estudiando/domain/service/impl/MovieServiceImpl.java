package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.common.container.DirectorIoC;
import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.domain.service.MovieService;
import com.fpmislata.estudiando.persistence.repository.DirectorRepository;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;
import com.fpmislata.estudiando.persistence.repository.impl.MovieRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAll() {
        return movieRepository.getAll();
    }

    @Override
    public Movie findById(int id) throws SQLException {
        return movieRepository.findById(id);
    }

    @Override
    public void insert(Movie movie) {
        DirectorRepository directorRepository = DirectorIoC.getDirectorRepository();
        Director director = directorRepository.findById(movie.getDirector().getId());
        if (director == null){
            throw new RuntimeException("El director no existe");
        }
        movie.setDirector(director);
        movieRepository.insert(movie);
    }
}
