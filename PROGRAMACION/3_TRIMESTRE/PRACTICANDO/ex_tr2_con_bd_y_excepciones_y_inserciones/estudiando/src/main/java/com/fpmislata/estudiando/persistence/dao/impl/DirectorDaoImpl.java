package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.persistence.dao.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.mapper.DirectorMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao {


/*    List<Director> directorList = List.of(
            new Director(1, "Francis Ford Coppola"),
            new Director(2, "Frank Darabont"),
            new Director(3, "Steven Spielberg"),
            new Director(4, "Michael Curtiz"),
            new Director(5, "Christopher Nolan"),
            new Director(6, "Jean Jaques Annaud"),
            new Director(7, "David Fincher"));*/

    @Override
    public List<Director> getAll() {
        List<Director> directorList = new ArrayList<>();
        ResultSet resultSet = rawSql.select("SELECT id , name FROM director;", null);
        directorList = (DirectorMapper.toDirectorList(resultSet));
        return directorList;
    }


    @Override
    public Director findByDirectorId(int id) {

        Director director;
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
        return DirectorMapper.toDirector(resultSet);


    }
}
