package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.common.ioc.CharacterMovieIOC;
import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.CharacterMovieMapper;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.EditorialMapper;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CharacterMovieDaobdImpl implements CharacterMovieDao {

    @Override
    public List<CharacterMovie> findCharacterByBookId (int id){
        List<Object> listCharacterId = List.of(id);
        ResultSet resultSet = Rawsql.select("select c.id, c.name, b.id, b.name, b.year from characters c Inner Join book b " +
                "on (b.id = c.book_id) where b.id=?;", listCharacterId);
        List<CharacterMovie> characterMovieList = CharacterMovieMapper.toCharacterMovieList(resultSet);
        try {
            return characterMovieList;
        }catch (Exception e){
            throw new RuntimeException("Error buscando un personaje por el id de un libro", e);
        }
    }

    @Override
    public List<CharacterMovie> findAll (){
        ResultSet resultSet = Rawsql.select("select c.id, c.name from characters c;", null);
        List<CharacterMovie> characterMovieList = CharacterMovieMapper.toCharacterMovieListNoBook(resultSet);
        return characterMovieList;
    }

    @Override
    public CharacterMovie findCharacterMovieByName (String name){
        List<Object> characterMovieName = List.of(name);
        ResultSet resultSet = Rawsql.select("select c.id, c.name from characters c where name = ?;",characterMovieName);
        try {
            resultSet.next();
        } catch (SQLException e){
            throw new RuntimeException("No se ha encontrado el personake mediante su nombre", e);
        }
        CharacterMovie characterMovie = CharacterMovieMapper.toCharacterMovieNoBook(resultSet);
        return characterMovie;
    }


}
