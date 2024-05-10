package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.persistence.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;
import com.fpmislata.estudiando.persistence.dao.mapper.DirectorEntityMapper;
import com.fpmislata.estudiando.persistence.dao.mapper.MovieEntityMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao {


/*    List<DirectorEntity> directorEntityList = List.of(
            new DirectorEntity(1, "Francis Ford Coppola"),
            new DirectorEntity(2, "Frank Darabont"),
            new DirectorEntity(3, "Steven Spielberg"),
            new DirectorEntity(4, "Michael Curtiz"),
            new DirectorEntity(5, "Christopher Nolan"),
            new DirectorEntity(6, "Jean Jaques Annaud"),
            new DirectorEntity(7, "David Fincher"));*/

    @Override
    public List<DirectorEntity> getAll() {
        List<DirectorEntity> directorEntityList = new ArrayList<>();
        ResultSet resultSet = rawSql.select("SELECT id , name FROM director;", null);
        directorEntityList = (DirectorEntityMapper.toDirectorEntityList(resultSet));
        return directorEntityList;
    }


    @Override
    public DirectorEntity findByDirectorId(int id) {

        DirectorEntity directorEntity;
        List<Object> listDirectorId = List.of(id);
        ResultSet resultSet = rawSql.select("""
                SELECT d.* FROM director d
                INNER JOIN movie m
                ON m.id_director = d.id
                and m.id = ?;
                        """, listDirectorId);
        try {
            resultSet.next();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return DirectorEntityMapper.toDirectorEntity(resultSet);


    }



}
