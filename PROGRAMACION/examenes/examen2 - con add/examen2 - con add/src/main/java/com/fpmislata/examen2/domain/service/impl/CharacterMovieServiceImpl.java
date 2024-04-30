package com.fpmislata.examen2.domain.service.impl;

import com.fpmislata.examen2.domain.service.CharacterMovieService;
import com.fpmislata.examen2.persistence.repository.CharacterMovieRepository;

public class CharacterMovieServiceImpl implements CharacterMovieService {
    CharacterMovieRepository characterMovieRepository;

    public CharacterMovieServiceImpl(CharacterMovieRepository characterMovieRepository) {
        this.characterMovieRepository = characterMovieRepository;
    }

}
