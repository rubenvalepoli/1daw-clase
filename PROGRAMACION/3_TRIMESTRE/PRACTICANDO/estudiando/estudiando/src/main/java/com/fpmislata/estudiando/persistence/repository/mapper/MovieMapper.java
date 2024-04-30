package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

public class MovieMapper {

    public static Movie toMovie(MovieEntity movieEntity){
        if (movieEntity == null){
            return null;
        }
        return new Movie(
                movieEntity.getId(),
                movieEntity.getName(),
                movieEntity.getYear()
        );
    }

}
