package com.fpmislata.Practica1b.persistence.impl;

import com.fpmislata.Practica1b.domain.entity.Author;
import com.fpmislata.Practica1b.persistence.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {


    List<Author> authorList = new ArrayList<>();

    public AuthorRepositoryImpl(){
        this.authorList.add(new Author(1,"Umberto Eco"));
        this.authorList.add(new Author(2,"Alejandro Dumas"));
        this.authorList.add(new Author(3,"Madeline Miller"));
        this.authorList.add(new Author(4,"Joanot Martorell"));
        this.authorList.add(new Author(5,"Carlo Ginzburg"));
        this.authorList.add(new Author(6,"Marc Bloch"));
    }

    @Override
    public List<Author> all() {
        return this.authorList;
    }
}
