package com.cipfpmislata.Ex3t_books.persistence.zdao;

import com.cipfpmislata.Ex3t_books.domain.entity.Characters;

import java.util.List;

public interface CharactersDao {

    public List<Characters> findAll();
    public Characters findByCharacterMovieId(int id);
    public List<Characters> findByMovie(Integer id);

}
