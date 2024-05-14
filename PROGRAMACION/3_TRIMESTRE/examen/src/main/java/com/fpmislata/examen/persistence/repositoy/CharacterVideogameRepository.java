package com.fpmislata.examen.persistence.repositoy;

import com.fpmislata.examen.domain.entity.CharacterVideogame;

import java.util.List;

public interface CharacterVideogameRepository {

    public List<CharacterVideogame> findCharacterVideogameByVideogameId (int id);
}
