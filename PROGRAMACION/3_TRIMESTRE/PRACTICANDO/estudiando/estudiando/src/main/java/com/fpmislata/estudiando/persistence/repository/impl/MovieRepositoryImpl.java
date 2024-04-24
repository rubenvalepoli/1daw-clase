package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.MovieDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;
import com.fpmislata.estudiando.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.estudiando.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;
import com.fpmislata.estudiando.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.estudiando.persistence.repository.mapper.MovieMapper;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private MovieDao movieDao = new MovieDaoImpl();
    private DirectorDao directorDao = new DirectorDaoImpl();

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

    @Override
    public Movie findById(int id){
        MovieEntity movieEntity = movieDao.findById(id);
        Director director = DirectorMapper.toDirector(directorDao.findById(movieEntity.getId_director()));
        Movie movie = MovieMapper.toMovie(movieEntity);
        movie.setDirector(director);
        return movie;
    }


}
