package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.persistence.dao.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.MovieDao;
import com.fpmislata.estudiando.persistence.dao.mapper.MovieMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao {

    /* private List<Movie> movieList = new ArrayList<>();

   public MovieDaoImpl(){
        this.movieList.add(new Movie(1, "El padrino", 1972, 1));
        this.movieList.add(new Movie(2, "Cadena perpetua", 1994, 2));
        this.movieList.add(new Movie(3, "La lista de Schindler", 1993, 3));
        this.movieList.add(new Movie(4, "Casablanca", 1942, 4));
        this.movieList.add(new Movie(5, "El padrino: Parte II", 1974, 1));
        this.movieList.add(new Movie(6, "El caballero oscuro", 2008, 5));
        this.movieList.add(new Movie(7, "El nombre de la rosa", 1986, 6));
        this.movieList.add(new Movie(8, "El club de la lucha", 1999, 7));
        this.movieList.add(new Movie(9, "En busca del arca perdida", 1981, 3));
        this.movieList.add(new Movie(10, "Indiana Jones y la última cruzada", 1989, 3));

    }*/

    @Override
    public List<Movie> getAll() {
        List<Movie> movieList = new ArrayList<>();
        ResultSet resultSet = rawSql.select("SELECT id , name, year, id_director FROM movie;", null);
        movieList = (MovieMapper.toMovieList(resultSet));
        return movieList;
    }

    @Override
    public Movie findByMovieId(int id) throws SQLException {
        List<Object> listMovieId = List.of(id);
        ResultSet resultSet = rawSql.select("""
                SELECT m.* FROM movie m
                INNER JOIN characterMovie cm
                ON cm.movieId = m.id
                and m.id = ?;
                    """, listMovieId);
        try {
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return MovieMapper.toMovie(resultSet);
    }
    
    /*@Override
    public void delete (int id) {

        List<Object> deleteMovieId = List.of(id);
        int resultSet = rawSql.delete("""
                DELETE from characterMovie where movieId = ?;
                delete from movie where id=?;
                """, deleteMovieId);*/

    @Override
    public void deleteCharacterMovie(int id) {
        List<Object> deleteMovieId = List.of(id);
        rawSql.delete("DELETE FROM characterMovie WHERE movieId = ?", deleteMovieId);
    }
    @Override
    public void deleteMovie(int id) {
        List<Object> deleteMovieId = List.of(id);
        rawSql.delete("DELETE FROM movie WHERE id = ?", deleteMovieId);
    }


/*    String sql = "DELETE cm, m" +
            "FROM characterMovie cm" +
            "JOIN movie m ON cm.movieId = m.id" +
            "WHERE m.id = ?;";
    List<Object> deleteMovieId = List.of(id);
    rawSql.delete(sql, deleteMovieId);*/



    @Override
    public void insert(Movie movie) {
        List<Object> params = List.of(movie.getId(),movie.getName(),movie.getYear(),movie.getDirector());
        Object object = rawSql.insert(" insert intro movie values ?,?,?,?"
                , params);
    }


}
