package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.common.container.ActorIoC;
import com.fpmislata.examen2.common.container.CharacterMovieIoC;
import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.Actor;
import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.ActorDao;
import com.fpmislata.examen2.persistence.dao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.ActorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.CharacterMovieMapper;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private MovieDao movieDao;
    private DirectorDao directorDao = DirectorIoC.getDirectorDao();
    private CharacterMovieDao characterMovieDao = CharacterMovieIoC.getCharacterMovieDao();
    private ActorDao actorDao = ActorIoC.getActorDao();

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
    public Movie findById(Integer id){
        MovieEntity movieEntity = movieDao.findById(id);
        Director director = DirectorMapper.toDirector(directorDao.findById(movieEntity.getDirectorId()));

        List<CharacterMovieEntity> characterMovieEntityList = characterMovieDao.findByMovie(id);
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
    public void insert(Movie movie){
        movieDao.insert(MovieMapper.toMovieEntity(movie));
    }

    @Override
    public void delete(Integer id){
        movieDao.delete(id);
    }
}
