package com.fpmislata.examen.persistence.repository;

import com.fpmislata.examen.domain.entity.Game;

import java.util.List;

public interface GameRepository {
    public List<Game> findAll();
    public Game findGameById(String game_code);
}
