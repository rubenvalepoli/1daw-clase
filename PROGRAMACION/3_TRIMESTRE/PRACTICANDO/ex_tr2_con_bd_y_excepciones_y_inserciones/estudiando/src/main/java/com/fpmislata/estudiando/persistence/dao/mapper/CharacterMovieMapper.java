package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.domain.entity.Actor;
import com.fpmislata.estudiando.domain.entity.CharacterMovie;
import com.fpmislata.estudiando.domain.entity.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMovieMapper {

    public static CharacterMovie toCharacterMovie(ResultSet resultSet) {
        try {
            return new CharacterMovie(
                                resultSet.getInt("id"),
                    resultSet.getString("charactername"),
                    new Movie(resultSet.getInt("movieId")),
                    new Actor(resultSet.getInt("actorId")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<CharacterMovie> toCharacterMovieList(ResultSet resultSet) {

        List<CharacterMovie> characterMovieList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            characterMovieList.add(toCharacterMovie(resultSet));
        }
        return characterMovieList;
    }


}
