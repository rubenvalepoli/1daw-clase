package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao {


    List<DirectorEntity> directorEntityList = List.of(
            new DirectorEntity(1, "Francis Ford Coppola"),
            new DirectorEntity(2, "Frank Darabont"),
            new DirectorEntity(3, "Steven Spielberg"),
            new DirectorEntity(4, "Michael Curtiz"),
            new DirectorEntity(5, "Christopher Nolan"),
            new DirectorEntity(6, "Jean Jaques Annaud"),
            new DirectorEntity(7, "David Fincher"));
    @Override
    public DirectorEntity findById(int id){
        for (DirectorEntity directorEntity : directorEntityList){
            if (id == directorEntity.getId()){
                return directorEntity;
            }
        }
        return null;
    }

    @Override
    public List<DirectorEntity> getAll() {
        return this.directorEntityList;
    }
}
