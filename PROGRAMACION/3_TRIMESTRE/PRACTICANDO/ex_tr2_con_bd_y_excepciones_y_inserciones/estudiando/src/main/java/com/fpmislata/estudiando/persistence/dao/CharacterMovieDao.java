package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.domain.entity.CharacterMovie;

import java.util.List;

public interface CharacterMovieDao {

    public List<CharacterMovie> getAll();
    public CharacterMovie findByCharacterMovieId(int id);
    public List<CharacterMovie> findByMovie(Integer id);

}
