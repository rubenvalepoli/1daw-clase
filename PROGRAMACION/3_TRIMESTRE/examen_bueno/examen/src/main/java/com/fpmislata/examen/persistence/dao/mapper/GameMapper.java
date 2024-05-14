package com.fpmislata.examen.persistence.dao.mapper;

import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.domain.entity.Game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameMapper {

    public static Game toGame(ResultSet resultSet) {

        if (resultSet == null) {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Game> toGameList(ResultSet resultSet) {
        List<Game> gameList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            gameList.add(toGame(resultSet));
        }
        return gameList;
    }
}
