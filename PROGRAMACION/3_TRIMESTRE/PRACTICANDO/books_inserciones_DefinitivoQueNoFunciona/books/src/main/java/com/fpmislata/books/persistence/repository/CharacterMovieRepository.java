package com.fpmislata.books.persistence.repository;

import com.fpmislata.books.domain.entity.CharacterMovie;

import java.util.List;

public interface CharacterMovieRepository {

    public List<CharacterMovie> findAll();

    public CharacterMovie findCharacterMovieByName (String name);
}
