package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.persistence.dao.entity.CharacterMovieEntity;

import java.util.List;

public interface CharacterMovieDao {

    public List<CharacterMovieEntity> getAll();
    public CharacterMovieEntity findByCharacterMovieId(int id);
    public List<CharacterMovieEntity> findByMovie(Integer id);

}
