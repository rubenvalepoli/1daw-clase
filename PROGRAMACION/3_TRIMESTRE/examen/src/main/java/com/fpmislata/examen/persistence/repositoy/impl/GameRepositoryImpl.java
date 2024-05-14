package com.fpmislata.examen.persistence.repositoy.impl;

import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.dao.impl.CharacterVideogameDaobdImpl;
import com.fpmislata.examen.persistence.repositoy.GameRepository;

import java.util.List;

public class GameRepositoryImpl implements GameRepository {
    private GameDao gameDao;
    private CharacterVideogameDaobdImpl characterGameDao;


    public GameRepositoryImpl(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public List<Game> findAll(){
        List<Game> gameList = gameDao.findAll();
        return gameList;
    }


    @Override
    public Game findGameById(String game_code){
        return this.gameDao.findGameByCode(game_code);
    }


}
