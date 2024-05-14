package com.fpmislata.examen.persistence.dao;

import com.fpmislata.examen.domain.entity.Game;

import java.util.List;

public interface GameDao {
    public List<Game> findAll();
    public Game findGameByCode(String game_code);
}
