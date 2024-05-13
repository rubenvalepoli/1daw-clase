package com.fpmislata.books.persistence.Dao;

import com.fpmislata.books.domain.entity.CharacterMovie;

import java.util.List;

public interface CharacterMovieDao {
    public List<CharacterMovie> findCharacterByBookId (int id);
    public List<CharacterMovie> findAll ();

    public CharacterMovie findCharacterMovieByName (String name);

}
