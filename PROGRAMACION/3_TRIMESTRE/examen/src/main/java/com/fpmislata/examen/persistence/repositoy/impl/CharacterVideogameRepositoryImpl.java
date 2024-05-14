package com.fpmislata.examen.persistence.repositoy.impl;

import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.persistence.dao.CharacterVideogameDao;
import com.fpmislata.examen.persistence.repositoy.CharacterVideogameRepository;

import java.util.List;

public class CharacterVideogameRepositoryImpl implements CharacterVideogameRepository {


    CharacterVideogameDao characterVideogameDao;

    public CharacterVideogameRepositoryImpl(CharacterVideogameDao characterVideogameDao) {
        this.characterVideogameDao = characterVideogameDao;
    }

    @Override
    public List<CharacterVideogame> findCharacterVideogameByVideogameId (int id){
        return this.characterVideogameDao.findCharacterVideogameByVideogameId(id);
    }



}
