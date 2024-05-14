package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.dao.bd.rawSql;
import com.fpmislata.examen.persistence.dao.mapper.GameMapper;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameDaobdImpl implements GameDao {

    @Override
    public List<Game> findAll(){
        try {
            List<Game> gameList = new ArrayList<>();
            ResultSet resultSet = rawSql.select("select * from games;",null );

            while (resultSet.next()){
                gameList.add(GameMapper.toGame(resultSet));
            }
            return gameList;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Game findGameById(String game_code){
        List<Object> listGameId = List.of(game_code);
        ResultSet resultSet = rawSql.select("Select * from games where game_code = ?;", listGameId);
        try {
            resultSet.next();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        Game game = GameMapper.toGame(resultSet);
        return game;
    }

    @Override
    public List<Game> findByDirectorId(int directorId) {
        List<Game> gameListByDeveloper = new ArrayList<>();
        List<Object> listVideogameID = List.of(directorId);
        ResultSet resultSet = rawSql.select("SELECT * FROM games WHERE director_id = ?", listVideogameID);
        gameListByDeveloper = GameMapper.toGameList(resultSet);
        return gameListByDeveloper;
    }

    @Override
    public void insert(Game game){
        String sql = "Insert into games (game_code, title, release_year, description, director_id) VALUES (?, ?, ?, ?, ?)";
        String sql2 = "Insert into games_characters (game_id, character_id) VALUES (?, ?)";
        List<Object> params = List.of(game.getGame_code(), game.getTitle(), game.getRelease_year(), game.getDescription(), game.getDirector().getId());
        Object object = rawSql.insert(sql, params);
        for (CharacterVideogame characterVideogame : game.getCharacterVideogameList()){
            List<Object> params2 = List.of(object, characterVideogame.getId());
            rawSql.insert(sql2, params2);
        }
    }

}
