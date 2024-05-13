package com.fpmislata.books.persistence.repository.impl;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;

public class CharacterMovieRepositoryImpl implements CharacterMovieRepository {

    private CharacterMovieDao characterMovieDao;

    @Override
    public CharacterMovie findByName(String name){
        return characterMovieDao.findByName(name);
    }

}
