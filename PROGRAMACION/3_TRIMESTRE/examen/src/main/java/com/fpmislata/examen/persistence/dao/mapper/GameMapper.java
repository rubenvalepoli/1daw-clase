package com.fpmislata.examen.persistence.dao.mapper;

import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.domain.entity.Game;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GameMapper {

    public static Game toGame(ResultSet resultSet){


        if (resultSet == null){
            return null;
        }

        try {
            return new Game(
                    resultSet.getInt("id"),
                    resultSet.getString("game_code"),
                    resultSet.getString("title"),
                    resultSet.getInt("release_year"),
                    resultSet.getString("description"),
                    new Director(resultSet.getInt("director_id"))
            );
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

}
/*
    private int id;
    private String gameCode;
    private String title;
    private int releaseYear;
    private String description;
    private Director director;*/
