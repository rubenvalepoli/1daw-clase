package com.fpmislata.estudiando.persistence.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.persistence.AuthorRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    List<Author> authorList = new ArrayList<>();

    public AuthorRepositoryImpl(){
        this.authorList.add(new Author(1,"Pepe"));
        this.authorList.add(new Author(2,"Juan"));
        this.authorList.add(new Author(3,"Pablo"));

    }


    @Override
    public List<Author> findAll() {
        return this.authorList;
    }
}
