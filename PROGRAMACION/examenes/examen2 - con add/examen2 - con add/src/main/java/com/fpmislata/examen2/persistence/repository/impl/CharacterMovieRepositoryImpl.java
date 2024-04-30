package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.persistence.dao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.repository.CharacterMovieRepository;

public class CharacterMovieRepositoryImpl implements CharacterMovieRepository{
    CharacterMovieDao characterMovieDao;

    public CharacterMovieRepositoryImpl(CharacterMovieDao characterMovieDao) {
        this.characterMovieDao = characterMovieDao;
    }
}
