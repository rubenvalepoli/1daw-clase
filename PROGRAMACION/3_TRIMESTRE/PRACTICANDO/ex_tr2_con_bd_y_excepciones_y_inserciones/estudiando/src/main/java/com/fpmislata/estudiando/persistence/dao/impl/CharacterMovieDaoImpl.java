package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.CharacterMovie;
import com.fpmislata.estudiando.persistence.dao.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.CharacterMovieDao;
import com.fpmislata.estudiando.persistence.dao.mapper.CharacterMovieMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMovieDaoImpl implements CharacterMovieDao {



/*    private List<CharacterMovie> characterMovieList = List.of(
            new CharacterMovie(1, 1, 1, "Vito Corleone"),
            new CharacterMovie(2, 1, 2, "Michael Corleone"),
            new CharacterMovie(3, 1, 3, "Sonny Corleone"),
            new CharacterMovie(4, 2, 4, "Andy Dufresne"),
            new CharacterMovie(5, 2, 5, "Ellis Boyd Redding"),
            new CharacterMovie(6, 2, 6,  "Warden Norton"),
            new CharacterMovie(7, 3, 7, "Oskar Schindler"),
            new CharacterMovie(8, 3, 8, "Itzhak Stern"),
            new CharacterMovie(9, 3, 9, "Amon Göth"),
            new CharacterMovie(10, 4, 10, "Rick Blaine"),
            new CharacterMovie(11, 4, 11, "Ilsa Lund"),
            new CharacterMovie(12, 4, 12, "Victor Laszlo"),
            new CharacterMovie(13, 5, 13, "Vito Corleone"),
            new CharacterMovie(14, 5, 2, "Michael Corleone"),
            new CharacterMovie(15, 5, 3, "Sonny Corleone"),
            new CharacterMovie(16, 6, 14, "Bruce Wayne"),
            new CharacterMovie(17, 6, 15, "Joker"),
            new CharacterMovie(18, 6, 16, "Jim Gordon"),
            new CharacterMovie(19, 7, 17, "Guillermo de Baskerville"),
            new CharacterMovie(20, 7, 18, "Adso de Melk"),
            new CharacterMovie(21, 7, 19, "Bernardo Gui"),
            new CharacterMovie(22, 8, 20, "Tyler Durden"),
            new CharacterMovie(23, 8, 21, "Narrador"),
            new CharacterMovie(24, 8, 22, "Marla Singer"),
            new CharacterMovie(25, 9, 23, "Indiana Jones"),
            new CharacterMovie(26, 9, 24, "Marion Ravenwood"),
            new CharacterMovie(27, 9, 25, "Sallah"),
            new CharacterMovie(28, 10, 23, "Indiana Jones"),
            new CharacterMovie(29, 10, 17, "Henry Jones"),
            new CharacterMovie(30, 10, 26, "Elsa Schneider")
    );*/


    @Override
    public List<CharacterMovie> getAll(){

        List<CharacterMovie> characterMovieList = new ArrayList<>();
        ResultSet resultSet = rawSql.select("SELECT id , movieId, actorId, charactername FROM characterMovie;", null);
        characterMovieList = (CharacterMovieMapper.toCharacterMovieList(resultSet));
        return characterMovieList;
    }
    @Override
    public CharacterMovie findByCharacterMovieId(int id){

        CharacterMovie characterMovie;
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
        return CharacterMovieMapper.toCharacterMovie(resultSet);
    }


    @Override
    public List<CharacterMovie> findByMovie(Integer id){
        List<CharacterMovie> characterMovieList = new ArrayList<>();
        List<Object> listMovie = List.of(id);
        ResultSet resultSet = rawSql.select("""
                SELECT ch.* FROM characterMovie ch
                INNER JOIN movie m
                ON ch.movieId = m.id
                and m.id = ?;
                """, listMovie);
        characterMovieList = CharacterMovieMapper.toCharacterMovieList(resultSet);
        return characterMovieList;
    }

}
