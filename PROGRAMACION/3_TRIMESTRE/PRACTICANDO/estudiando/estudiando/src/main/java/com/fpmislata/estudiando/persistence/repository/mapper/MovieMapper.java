package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieMapper {

    public static Movie toMovie(MovieEntity movieEntity) {
        if (movieEntity == null) {
            return null;
        }
        return new Movie(
                movieEntity.getId(),
                movieEntity.getName(),
                movieEntity.getYear()
        );
    }

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
        List<Movie> movieList = new ArrayList<>();
        for (MovieEntity movieEntity : movieEntityList) {
            movieList.add(toMovie(movieEntity));
        }
        return movieList;
    }


    public static MovieEntity toMovieEntity(Movie movie) {
        if (movie == null) {
            return null;
        }
        return new MovieEntity(
                movie.getId(),
                movie.getName(),
                movie.getYear(),
                movie.getDirector().getId()
        );
    }

}
