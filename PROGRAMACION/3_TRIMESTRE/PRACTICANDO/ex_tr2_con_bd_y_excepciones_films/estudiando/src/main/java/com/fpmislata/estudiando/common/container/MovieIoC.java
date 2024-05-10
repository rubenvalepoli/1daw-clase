package com.fpmislata.estudiando.common.container;

import com.fpmislata.estudiando.domain.service.MovieService;
import com.fpmislata.estudiando.domain.service.impl.MovieServiceImpl;
import com.fpmislata.estudiando.persistence.dao.MovieDao;
import com.fpmislata.estudiando.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;
import com.fpmislata.estudiando.persistence.repository.impl.MovieRepositoryImpl;

public class MovieIoC {


    private static MovieService movieService;
    private static MovieRepository movieRepository;
    private static MovieDao movieDao;

    public static MovieDao getMovieDao(){
        if (movieDao == null){
            movieDao = new MovieDaoImpl();
        }
        return movieDao;
    }
    public static MovieRepository getMovieRepository(){
        if (movieRepository == null){
            movieRepository = new MovieRepositoryImpl(getMovieDao());
        }
        return movieRepository;
    }

    public static MovieService getMovieService(){
        if (movieService == null){
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }
}
