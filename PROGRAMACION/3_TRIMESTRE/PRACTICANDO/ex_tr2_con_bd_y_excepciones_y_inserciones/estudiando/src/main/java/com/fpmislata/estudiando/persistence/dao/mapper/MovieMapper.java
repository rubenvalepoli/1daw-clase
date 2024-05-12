package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.domain.entity.CharacterMovie;
import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.domain.entity.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieMapper {


    public static Movie toMovie(ResultSet resultSet){
        if( resultSet == null){
            return null;
        }
        try {
            return new Movie(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("year"),
                    new Director(resultSet.getInt("id_director")));
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static List<Movie> toMovieList(ResultSet resultSet){

        List<Movie> movieList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            }catch (SQLException e){
                throw  new RuntimeException(e);
            }
            movieList.add(toMovie(resultSet));
        }
        return movieList;
    }

}
