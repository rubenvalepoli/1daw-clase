package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.CharacterMovieMapper;

import java.sql.ResultSet;
import java.util.List;

public class CharacterMovieDaobdImpl implements CharacterMovieDao {

    @Override
    public List<CharacterMovie> findCharacterByBookId(int id) {
        List<Object> listCharacterId = List.of(id);
        ResultSet resultSet = Rawsql.select("select c.id, c.name, b.id, b.name, b.year from characters c Inner Join book b " +
                "on (b.id = c.book_id) where b.id=?;", listCharacterId);
        List<CharacterMovie> characterMovieList = CharacterMovieMapper.toCharacterMovieList(resultSet);
        return characterMovieList;
    }

    @Override
    public CharacterMovie findByName(String name) {

        List<Object> params = List.of(name);

        String sql = "SELECT * FROM 'character' WHERE name = ?";

        return CharacterMovieMapper.toCharacterMovie(Rawsql.select(sql,params));
    }




}
