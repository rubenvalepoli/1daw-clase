package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.persistence.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.CharacterMovieDao;
import com.fpmislata.estudiando.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;
import com.fpmislata.estudiando.persistence.dao.mapper.CharacterMovieEntityMapper;
import com.fpmislata.estudiando.persistence.dao.mapper.MovieEntityMapper;
import com.fpmislata.estudiando.persistence.repository.mapper.CharacterMovieMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMovieDaoImpl implements CharacterMovieDao {



/*    private List<CharacterMovieEntity> characterMovieEntityList = List.of(
            new CharacterMovieEntity(1, 1, 1, "Vito Corleone"),
            new CharacterMovieEntity(2, 1, 2, "Michael Corleone"),
            new CharacterMovieEntity(3, 1, 3, "Sonny Corleone"),
            new CharacterMovieEntity(4, 2, 4, "Andy Dufresne"),
            new CharacterMovieEntity(5, 2, 5, "Ellis Boyd Redding"),
            new CharacterMovieEntity(6, 2, 6,  "Warden Norton"),
            new CharacterMovieEntity(7, 3, 7, "Oskar Schindler"),
            new CharacterMovieEntity(8, 3, 8, "Itzhak Stern"),
            new CharacterMovieEntity(9, 3, 9, "Amon Göth"),
            new CharacterMovieEntity(10, 4, 10, "Rick Blaine"),
            new CharacterMovieEntity(11, 4, 11, "Ilsa Lund"),
            new CharacterMovieEntity(12, 4, 12, "Victor Laszlo"),
            new CharacterMovieEntity(13, 5, 13, "Vito Corleone"),
            new CharacterMovieEntity(14, 5, 2, "Michael Corleone"),
            new CharacterMovieEntity(15, 5, 3, "Sonny Corleone"),
            new CharacterMovieEntity(16, 6, 14, "Bruce Wayne"),
            new CharacterMovieEntity(17, 6, 15, "Joker"),
            new CharacterMovieEntity(18, 6, 16, "Jim Gordon"),
            new CharacterMovieEntity(19, 7, 17, "Guillermo de Baskerville"),
            new CharacterMovieEntity(20, 7, 18, "Adso de Melk"),
            new CharacterMovieEntity(21, 7, 19, "Bernardo Gui"),
            new CharacterMovieEntity(22, 8, 20, "Tyler Durden"),
            new CharacterMovieEntity(23, 8, 21, "Narrador"),
            new CharacterMovieEntity(24, 8, 22, "Marla Singer"),
            new CharacterMovieEntity(25, 9, 23, "Indiana Jones"),
            new CharacterMovieEntity(26, 9, 24, "Marion Ravenwood"),
            new CharacterMovieEntity(27, 9, 25, "Sallah"),
            new CharacterMovieEntity(28, 10, 23, "Indiana Jones"),
            new CharacterMovieEntity(29, 10, 17, "Henry Jones"),
            new CharacterMovieEntity(30, 10, 26, "Elsa Schneider")
    );*/


    @Override
    public List<CharacterMovieEntity> getAll(){

        List<CharacterMovieEntity> characterMovieEntityList = new ArrayList<>();
        ResultSet resultSet = rawSql.select("SELECT id , movieId, actorId, charactername FROM characterMovie;", null);
        characterMovieEntityList = (CharacterMovieEntityMapper.toCharacterMovieEntityList(resultSet));
        return characterMovieEntityList;
    }
    @Override
    public CharacterMovieEntity findByCharacterMovieId(int id){

        CharacterMovieEntity characterMovieEntity;
        List<Object> listCharacterMovie = List.of(id);
        ResultSet resultSet = rawSql.select("""
                SELECT ch.* FROM characterMovie ch
                where ch.id = ?;
                """, listCharacterMovie);
        try {
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return CharacterMovieEntityMapper.toCharacterMovieEntity(resultSet);
    }


    @Override
    public List<CharacterMovieEntity> findByMovie(Integer id){
        List<CharacterMovieEntity> characterMovieEntityList = new ArrayList<>();
        List<Object> listMovie = List.of(id);
        ResultSet resultSet = rawSql.select("""
                SELECT ch.* FROM characterMovie ch
                INNER JOIN movie m
                ON ch.movieId = m.id
                and m.id = ?;
                """, listMovie);
        characterMovieEntityList = CharacterMovieEntityMapper.toCharacterMovieEntityList(resultSet);
        return characterMovieEntityList;
    }

}
