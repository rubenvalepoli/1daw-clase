package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.persistence.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.MovieDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;
import com.fpmislata.estudiando.persistence.dao.mapper.ActorEntityMapper;
import com.fpmislata.estudiando.persistence.dao.mapper.MovieEntityMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieDaoImpl implements MovieDao {

    /* private List<MovieEntity> movieEntityList = new ArrayList<>();

   public MovieDaoImpl(){
        this.movieEntityList.add(new MovieEntity(1, "El padrino", 1972, 1));
        this.movieEntityList.add(new MovieEntity(2, "Cadena perpetua", 1994, 2));
        this.movieEntityList.add(new MovieEntity(3, "La lista de Schindler", 1993, 3));
        this.movieEntityList.add(new MovieEntity(4, "Casablanca", 1942, 4));
        this.movieEntityList.add(new MovieEntity(5, "El padrino: Parte II", 1974, 1));
        this.movieEntityList.add(new MovieEntity(6, "El caballero oscuro", 2008, 5));
        this.movieEntityList.add(new MovieEntity(7, "El nombre de la rosa", 1986, 6));
        this.movieEntityList.add(new MovieEntity(8, "El club de la lucha", 1999, 7));
        this.movieEntityList.add(new MovieEntity(9, "En busca del arca perdida", 1981, 3));
        this.movieEntityList.add(new MovieEntity(10, "Indiana Jones y la última cruzada", 1989, 3));

    }*/

    @Override
    public List<MovieEntity> getAll() {
        List<MovieEntity> movieEntityList = new ArrayList<>();
        ResultSet resultSet = rawSql.select("SELECT id , name, year, id_director FROM movie;", null);
        movieEntityList = (MovieEntityMapper.toMovieEntityList(resultSet));
        return movieEntityList;
    }

    @Override
    public MovieEntity findByMovieId(int id) throws SQLException {

        MovieEntity movieEntity;
        List<Object> listMovieId = List.of(id);
        ResultSet resultSet = rawSql.select("""
                SELECT m.* FROM movie m
                INNER JOIN characterMovie cm
                ON cm.movieId = m.id
                and cm.id = ?;
                    """, listMovieId);
        try {
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return MovieEntityMapper.toMovieEntity(resultSet);
    }
}
