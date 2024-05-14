package com.fpmislata.examen.domain.service;

import com.fpmislata.examen.domain.entity.Game;

import java.util.List;

public interface GameService {

    public List<Game> findAll();
    public Game findGameById(String game_code);
    public List<Game> findByDirectorId(int directorId);
    public void insert(Game game);
}
