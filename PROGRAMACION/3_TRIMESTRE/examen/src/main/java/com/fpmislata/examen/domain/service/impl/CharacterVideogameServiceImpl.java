package com.fpmislata.examen.domain.service.impl;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.domain.service.CharacterVideogameService;
import com.fpmislata.examen.persistence.repositoy.CharacterVideogameRepository;

import java.util.List;

public class CharacterVideogameServiceImpl implements CharacterVideogameService {



    CharacterVideogameRepository characterVideogameRepository;

    public CharacterVideogameServiceImpl(CharacterVideogameRepository characterVideogameRepository) {
        this.characterVideogameRepository = characterVideogameRepository;
    }

    @Override
    public List<CharacterVideogame> findCharacterVideogameByVideogameId (int id){
        return this.characterVideogameRepository.findCharacterVideogameByVideogameId(id);
    }

}
