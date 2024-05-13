package com.cipfpmislata.Ex3t_books.persistence.dao.jdbc;

import com.cipfpmislata.Ex3t_books.domain.entity.Author;
import com.cipfpmislata.Ex3t_books.persistence.dao.AuthorDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.db.Rawsql;
import com.cipfpmislata.Ex3t_books.persistence.dao.mapper.AuthorMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoJdbc implements AuthorDao {

    @Override
    public Author findById(Integer id) {
        try {
            String sql = "select * from author where id=?";
            List<Object> params = List.of(id);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return AuthorMapper.toAuthor(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Author findByName(String name) {
        try {
            String sql = "SELECT * FROM author WHERE name LIKE ?";
            List<Object> params = List.of(name);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return AuthorMapper.toAuthor(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Author> findAll() {
        try {
            String sql = "select * from author";
            ResultSet resultSet = Rawsql.select(sql, null);
            List<Author> authorlist = new ArrayList<>();
            while (resultSet.next()) {
                authorlist.add(AuthorMapper.toAuthor(resultSet));
            }
            return authorlist;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
