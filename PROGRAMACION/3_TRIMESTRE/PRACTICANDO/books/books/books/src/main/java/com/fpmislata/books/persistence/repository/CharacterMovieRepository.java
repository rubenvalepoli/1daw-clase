package com.fpmislata.books.persistence.repository;

import com.fpmislata.books.domain.entity.CharacterMovie;

public interface CharacterMovieRepository {

    public CharacterMovie findByName(String name);

}
