package com.cipfpmislata.Ex3t_books.persistence.dao.jdbc;

import com.cipfpmislata.Ex3t_books.domain.entity.Characters;
import com.cipfpmislata.Ex3t_books.persistence.dao.CharactersDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.db.Rawsql;
import com.cipfpmislata.Ex3t_books.persistence.dao.mapper.CharacterMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CharactersDaoJdbc implements CharactersDao {

    @Override
    public List<Characters> findAll() {
        String sql = "select * from characters";
        ResultSet resultSet = Rawsql.select(sql, null);
        return CharacterMapper.toCharactersList(resultSet);
    }

    @Override
    public Characters findById(Integer id) {
        try {
            String sql = "select * from characters where id=?";
            List<Object> params = List.of(id);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return CharacterMapper.toCharacters(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Characters> findByBook(Integer bookId) {
        String sql = "select * from characters where book_id=?";
        List<Object> params = List.of(bookId);
        ResultSet resultSet = Rawsql.select(sql, params);
        return CharacterMapper.toCharactersList(resultSet);
    }

}
