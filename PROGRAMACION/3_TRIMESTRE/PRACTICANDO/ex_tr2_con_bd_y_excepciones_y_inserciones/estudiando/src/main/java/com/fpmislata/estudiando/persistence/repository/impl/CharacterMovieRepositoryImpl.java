package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.persistence.dao.CharacterMovieDao;
import com.fpmislata.estudiando.persistence.repository.CharacterMovieRepository;

public class CharacterMovieRepositoryImpl implements CharacterMovieRepository {
    CharacterMovieDao characterMovieDao;

    public CharacterMovieRepositoryImpl(CharacterMovieDao characterMovieDao){
        this.characterMovieDao = characterMovieDao;
    }
}
