package com.fpmislata.books.domain.service;

import com.fpmislata.books.domain.entity.CharacterMovie;

public interface CharacterMovieService {
    public CharacterMovie findByName(String name);
}
