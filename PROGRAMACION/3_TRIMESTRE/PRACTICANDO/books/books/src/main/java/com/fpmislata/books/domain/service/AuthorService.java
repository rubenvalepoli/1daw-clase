package com.fpmislata.books.domain.service;

import com.fpmislata.books.domain.entity.Author;

public interface AuthorService {
    public Author findByAuthorId(int id);
}
