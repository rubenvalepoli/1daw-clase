package com.fpmislata.examen.persistence.dao;

import com.fpmislata.examen.domain.entity.Game;

import java.util.List;

public interface GameDao {
    public List<Game> findAll();
    public Game findGameById(String game_code);
    public List<Game> findByDirectorId(int directorId);
    public void insert(Game game);
}
