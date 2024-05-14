package com.fpmislata.examen.persistence.repository.impl;

import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.repository.GameRepository;

import java.util.List;

public class GameRepositoryImpl implements GameRepository {

    GameDao gameDao;

    public GameRepositoryImpl(GameDao gamesDao) {
        this.gameDao = gamesDao;
    }

    @Override
    public List<Game> findAll(){
        return this.gameDao.findAll();
    }

    @Override
    public Game findGameById(String game_code){
        return this.gameDao.findGameById(game_code);
    }
}
