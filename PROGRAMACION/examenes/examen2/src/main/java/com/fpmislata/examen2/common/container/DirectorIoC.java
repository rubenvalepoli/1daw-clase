package com.fpmislata.examen2.common.container;


import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.examen2.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.impl.MovieRepositoryImpl;

public class DirectorIoC {
/*    private static MovieService movieService;
    private static MovieRepository movieRepository;
    private static DirectorDao directorDao;

    public static DirectorDao getDirectorDao(){
        if (directorDao == null){
            directorDao = new DirectorDaoImpl();
        }
        return directorDao;
    }
    public static MovieRepository getMovieRepository(){
        if (movieRepository == null){
            movieRepository = new MovieRepositoryImpl(getDirectorDao());
        }
        return movieRepository;
    }

    public static MovieService getMovieService(){
        if (movieService == null){
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }*/

}
