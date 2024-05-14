package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.dao.bd.Rawsql;
import com.fpmislata.examen.persistence.dao.mapper.GameMapper;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameDaobdImpl implements GameDao {

    @Override
    public List<Game> findAll(){
        try{
            List<Game> gameList = new ArrayList<>();
            ResultSet resultSet = Rawsql.select("SELECT * FROM games;", null);

            while (resultSet.next()){
                gameList.add(GameMapper.toGame(resultSet));
            }
            return gameList;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }



    @Override
    public Game findGameByCode(String game_code){
        List<Object> listGameId = List.of(game_code);
        ResultSet resultSet = Rawsql.select("SELECT * from games where game_code = ?;", listGameId);
        try {
            resultSet.next();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        Game game = GameMapper.toGame(resultSet);
        return game;
    }

}
