package com.fpmislata.examen2.domain.service.impl;

import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.examen2.persistence.repository.DirectorRepository;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.impl.DirectorRepositoryImpl;
import com.fpmislata.examen2.persistence.repository.impl.MovieRepositoryImpl;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public List<Movie> getAll() {
        return this.movieRepository.getAll();
    }

    @Override
    public Movie findById(Integer id) {
        return this.movieRepository.findById(id);
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

    @Override
    public void delete (Integer id){
        movieRepository.delete(id);
    }
}
