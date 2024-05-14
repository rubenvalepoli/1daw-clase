package com.fpmislata.books.domain.service;

import com.fpmislata.books.domain.entity.CharacterMovie;

import java.util.List;

public interface CharacterMovieService {

    public List<CharacterMovie> findAll();

    public CharacterMovie findCharacterMovieByName (String name);
}
