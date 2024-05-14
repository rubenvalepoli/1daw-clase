package com.fpmislata.examen.persistence.dao;

import java.util.List;

public interface CharacterVideogameDao {
    public List<com.fpmislata.examen.domain.entity.CharacterVideogame> findCharacterVideogameByVideogameId (int id);
}
