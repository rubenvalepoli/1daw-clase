package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    private MovieDao movieDao;

    @Override
    public List<Movie> getAll() {
        List<MovieEntity> movieEntityList = movieDao.getAll();
        List<Movie> movieList = new ArrayList<>();
        for (MovieEntity movieEntity : movieEntityList){
            Movie movie = MovieMapper.toMovie(movieEntity);
            movieList.add(movie);
        }
        return movieList;
    }
}
