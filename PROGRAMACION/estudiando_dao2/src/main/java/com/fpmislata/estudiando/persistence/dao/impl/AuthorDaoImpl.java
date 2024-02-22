package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.persistence.dao.AuthorDao;
import com.fpmislata.estudiando.persistence.dao.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao {


    List<AuthorEntity> authorEntityList = new ArrayList<>();

    public AuthorDaoImpl(){
        this.authorEntityList.add(new AuthorEntity(1,"Pepe"));
        this.authorEntityList.add(new AuthorEntity(2,"Juan"));
        this.authorEntityList.add(new AuthorEntity(3,"Pablo"));

    }


    @Override
    public List<AuthorEntity> findAll() {
        return this.authorEntityList;
    }

}
