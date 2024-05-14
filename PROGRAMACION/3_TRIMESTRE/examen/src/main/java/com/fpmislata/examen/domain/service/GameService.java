package com.fpmislata.examen.domain.service;

import com.fpmislata.examen.domain.entity.Game;

import java.util.List;

public interface GameService {
    public List<Game> findAll();
    public Game findGameByCode(String game_code);
}
