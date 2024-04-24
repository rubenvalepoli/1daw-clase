package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.persistence.dao.MovieDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao {

    private List<MovieEntity> movieEntityList = new ArrayList<>();

    public MovieDaoImpl(){
        this.movieEntityList.add(new MovieEntity(1,"El Padrino",1));
        this.movieEntityList.add(new MovieEntity(2,"Cadena Perpetua",2));

    }

    @Override
    public List<MovieEntity> getAll(){
        return movieEntityList;
    }
    @Override
    public MovieEntity findById(int id){
        for (MovieEntity movieEntity : movieEntityList){
            if (id == movieEntity.getId()){
                return movieEntity;
            }
        }
        return null;
    }



}
