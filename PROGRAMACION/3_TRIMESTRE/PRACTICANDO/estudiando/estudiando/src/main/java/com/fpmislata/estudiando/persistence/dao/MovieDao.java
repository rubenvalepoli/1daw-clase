package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

import java.sql.SQLException;
import java.util.List;

public interface MovieDao {

    public List<MovieEntity> getAll();
    public MovieEntity findById(int id) throws SQLException;

}
