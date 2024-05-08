package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import static com.fpmislata.estudiando.persistence.repository.mapper.MovieMapper.toMovieEntity;

public class MovieEntityMapper {


    public static MovieEntity toMovieEntity(ResultSet resultSet){
        try {
            return new MovieEntity(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("year"),
                    resultSet.getInt("id_director"));
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static List<MovieEntity> toMovieEntityList(ResultSet resultSet){

        List<MovieEntity> movieEntityList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            }catch (SQLException e){
                throw  new RuntimeException(e);
            }
            movieEntityList.add(toMovieEntity(resultSet));
        }
        return movieEntityList;
    }

}
