package com.cipfpmislata.Ex3t_books.persistence.repository;

import com.cipfpmislata.Ex3t_books.domain.entity.Characters;

import java.util.List;

public interface CharactersRepository {

    public List<Characters> findAll();
    public Characters findByCharacterMovieId(int id);
    public List<Characters> findByMovie(Integer id);

}
