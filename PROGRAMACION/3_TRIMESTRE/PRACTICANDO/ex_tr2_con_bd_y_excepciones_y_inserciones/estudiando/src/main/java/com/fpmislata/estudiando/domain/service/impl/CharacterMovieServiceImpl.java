package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.service.CharacterMovieService;
import com.fpmislata.estudiando.persistence.repository.CharacterMovieRepository;

public class CharacterMovieServiceImpl implements CharacterMovieService {
    CharacterMovieRepository characterMovieRepository;

    public CharacterMovieServiceImpl(CharacterMovieRepository characterMovieRepository){
        this.characterMovieRepository = characterMovieRepository;
    }

}
