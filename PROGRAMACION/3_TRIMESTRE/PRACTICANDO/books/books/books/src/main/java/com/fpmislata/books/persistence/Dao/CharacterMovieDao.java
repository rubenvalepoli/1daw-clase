package com.fpmislata.books.persistence.Dao;

import com.fpmislata.books.domain.entity.CharacterMovie;

import java.util.List;

public interface CharacterMovieDao {
    public List<CharacterMovie> findCharacterByBookId (int id);
    public CharacterMovie findByName(String name);

}
