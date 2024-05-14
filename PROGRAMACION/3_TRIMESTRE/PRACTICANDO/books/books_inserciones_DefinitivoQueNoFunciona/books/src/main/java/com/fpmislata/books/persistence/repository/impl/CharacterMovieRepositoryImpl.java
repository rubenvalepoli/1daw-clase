package com.fpmislata.books.persistence.repository.impl;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;

import java.util.List;

public class CharacterMovieRepositoryImpl implements CharacterMovieRepository {

    CharacterMovieDao characterMovieDao;

    public CharacterMovieRepositoryImpl(CharacterMovieDao characterMovieDao) {
        this.characterMovieDao = characterMovieDao;
    }

    @Override
    public List<CharacterMovie> findAll(){
        return characterMovieDao.findAll();
    }

    public CharacterMovie findCharacterMovieByName (String name){
        return characterMovieDao.findCharacterMovieByName(name);
    }
}
