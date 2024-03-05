package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;

import java.util.List;

public interface CharacterMovieDao {

    public CharacterMovieEntity findById(Integer id);

    public List<CharacterMovieEntity> getAll();

    public List<CharacterMovieEntity> findByMovie(Integer id);
}
