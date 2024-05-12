package com.cipfpmislata.Ex3t_books.persistence.zdao.jdbc;

import com.cipfpmislata.Ex3t_books.domain.entity.Characters;
import com.cipfpmislata.Ex3t_books.persistence.zdao.CharactersDao;
import com.cipfpmislata.Ex3t_books.persistence.zdao.jdbc.db.Rawsql;
import com.cipfpmislata.Ex3t_books.persistence.zdao.mapper.CharacterMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharactersDAoJdbc implements CharactersDao {

    @Override
    public List<Characters> findAll() {
        try {
            List<Object> params= new ArrayList<>();
            String sql = "select * from characters where id=?";
            ResultSet resultSet= Rawsql.select(sql,params);
            resultSet.next();
            return CharacterMapper.toCharactersList(resultSet);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Characters findByCharacterMovieId(int id) {
        return null;
    }

    @Override
    public List<Characters> findByMovie(Integer id) {
        return null;
    }
}
