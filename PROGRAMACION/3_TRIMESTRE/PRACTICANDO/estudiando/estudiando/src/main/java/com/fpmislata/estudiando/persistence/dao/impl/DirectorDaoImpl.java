package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao {


    List<DirectorEntity> directorEntityList = List.of(
      new DirectorEntity(1,"Francis Ford Coppola"),
      new DirectorEntity(2,"Frank Darabont"));

    @Override
    public DirectorEntity findById(int id){
        for (DirectorEntity directorEntity : directorEntityList){
            if (id == directorEntity.getId()){
                return directorEntity;
            }
        }
        return null;
    }
}
