package com.fpmislata.examen.domain.service;

import com.fpmislata.examen.domain.entity.CharacterVideogame;

import java.util.List;

public interface CharacterVideogameService {

    public List<CharacterVideogame> findCharacterVideogameByVideogameId (int id);

}
