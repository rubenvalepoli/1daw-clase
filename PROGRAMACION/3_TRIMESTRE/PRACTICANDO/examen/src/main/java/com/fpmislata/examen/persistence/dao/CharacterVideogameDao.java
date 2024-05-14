package com.fpmislata.examen.persistence.dao;

import com.fpmislata.examen.domain.entity.CharacterVideogame;

import java.util.List;

public interface CharacterVideogameDao {
    public List<CharacterVideogame> findCharacterVideogameByVideogameId (int id);
}
