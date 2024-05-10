package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.persistence.dao.entity.CharacterMovieEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMovieEntityMapper {

    public static CharacterMovieEntity toCharacterMovieEntity(ResultSet resultSet){
        try {
            return new CharacterMovieEntity(
                    resultSet.getInt("id"),
                    resultSet.getInt("movieId"),
                    resultSet.getInt("actorId"),
                    resultSet.getString("charactername"));
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static List<CharacterMovieEntity> toCharacterMovieEntityList(ResultSet resultSet){

        List<CharacterMovieEntity> characterMovieEntityList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
            characterMovieEntityList.add(toCharacterMovieEntity(resultSet));
        }
        return characterMovieEntityList;
    }





}
