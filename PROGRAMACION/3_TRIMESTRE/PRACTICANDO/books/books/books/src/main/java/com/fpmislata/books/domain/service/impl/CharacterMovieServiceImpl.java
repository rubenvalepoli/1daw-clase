package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.service.CharacterMovieService;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;

public class CharacterMovieServiceImpl implements CharacterMovieService {
    CharacterMovieRepository characterRepository;


    @Override
    public CharacterMovie findByName(String name){
        CharacterMovie characterMovie= characterRepository.findByName(name);
        return characterMovie;

    }


}
