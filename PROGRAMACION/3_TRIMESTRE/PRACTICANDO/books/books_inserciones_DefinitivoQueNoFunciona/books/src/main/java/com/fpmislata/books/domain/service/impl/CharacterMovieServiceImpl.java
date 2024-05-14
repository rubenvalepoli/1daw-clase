package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.service.CharacterMovieService;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;

import java.util.List;

public class CharacterMovieServiceImpl implements CharacterMovieService {

    CharacterMovieRepository characterMovieRepository;

    public CharacterMovieServiceImpl(CharacterMovieRepository characterMovieRepository) {
        this.characterMovieRepository = characterMovieRepository;
    }

    @Override
    public List<CharacterMovie> findAll(){
        return characterMovieRepository.findAll();
    }

    @Override
    public CharacterMovie findCharacterMovieByName (String name){
        try{
            return characterMovieRepository.findCharacterMovieByName(name);
        } catch (Exception e){
            throw new RuntimeException("El personaje no existe");
        }

    }
}
