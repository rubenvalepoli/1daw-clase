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
import com.fpmislata.estudiando.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;
import com.fpmislata.estudiando.persistence.dao.impl.ActorDaoImpl;
import com.fpmislata.estudiando.persistence.dao.impl.CharacterMovieDaoImpl;
import com.fpmislata.estudiando.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.estudiando.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;
import com.fpmislata.estudiando.persistence.repository.mapper.ActorMapper;
import com.fpmislata.estudiando.persistence.repository.mapper.CharacterMovieMapper;
import com.fpmislata.estudiando.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.estudiando.persistence.repository.mapper.MovieMapper;

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
        List<CharacterMovieEntity>characterMovieEntityList = characterMovieDao.findByMovie(id);
        List<CharacterMovie> characterMovieList = new ArrayList<>();

        for (CharacterMovieEntity characterMovieEntity1 : characterMovieEntityList){
            Actor actor = ActorMapper.toActor(actorDao.findById(characterMovieEntity1.getActorId()));
            CharacterMovie characterMovie = CharacterMovieMapper.toCharacterMovie(characterMovieEntity1);
            characterMovie.setActor(actor);
            characterMovieList.add(characterMovie);
       }

        Movie movie = MovieMapper.toMovie(movieEntity);
        movie.setCharacterMovieList(characterMovieList);
        movie.setDirector(director);
        return movie;
    }

    @Override
    public void insert(Movie movie) {

    }


}
