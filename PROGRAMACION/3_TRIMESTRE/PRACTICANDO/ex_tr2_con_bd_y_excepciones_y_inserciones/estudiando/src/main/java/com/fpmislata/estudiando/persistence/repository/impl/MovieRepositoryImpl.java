package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.common.container.DirectorIoC;
import com.fpmislata.estudiando.domain.entity.Actor;
import com.fpmislata.estudiando.domain.entity.CharacterMovie;
import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.persistence.dao.ActorDao;
import com.fpmislata.estudiando.persistence.dao.CharacterMovieDao;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.MovieDao;
import com.fpmislata.estudiando.persistence.dao.impl.ActorDaoImpl;
import com.fpmislata.estudiando.persistence.dao.impl.CharacterMovieDaoImpl;
import com.fpmislata.estudiando.persistence.dao.mapper.ActorMapper;
import com.fpmislata.estudiando.persistence.dao.mapper.CharacterMovieMapper;
import com.fpmislata.estudiando.persistence.dao.mapper.DirectorMapper;
import com.fpmislata.estudiando.persistence.dao.mapper.MovieMapper;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private MovieDao movieDao;
    private DirectorDao directorDao = DirectorIoC.getDirectorDao();

    private CharacterMovieDao characterMovieDao = new CharacterMovieDaoImpl();

    private ActorDao actorDao = new ActorDaoImpl();

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> getAll() {

        return movieDao.getAll();
    }

    @Override
    public Movie findByMovieId(int id) throws SQLException {
        Movie movie = movieDao.findByMovieId(id);
        Director director = directorDao.findByDirectorId(id);


        List<CharacterMovie> characterMovieList = new ArrayList<>();
        characterMovieDao.findByMovie(id);

        for (CharacterMovie characterMovie : characterMovieList) {
            Actor actor = actorDao.findByCharacterId(characterMovie.getId());
            characterMovieDao.findByCharacterMovieId(id);
            characterMovie.setActor(actor);
            characterMovieList.add(characterMovie);
        }
        movie.setCharacterMovieList(characterMovieList);
        movie.setDirector(director);
        return movie;
    }

    @Override
    public void deleteMovie (int id){
        movieDao.deleteMovie(id);
    }

    @Override
    public void deleteCharacterMovie (int id){
        movieDao.deleteCharacterMovie(id);
    }


    @Override
    public void insert(Movie movie) {
        movieDao.insert(movie);
    }


}
