package com.cipfpmislata.Ex3t_books.persistence.dao.jdbc;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;
import com.cipfpmislata.Ex3t_books.persistence.dao.EditorialDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.db.Rawsql;
import com.cipfpmislata.Ex3t_books.persistence.dao.mapper.EditorialMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EditorialDaoJdbc implements EditorialDao {

    @Override
    public Editorial findById(Integer id) {
        try {
            String sql = "select * from editorial where id=?";
            //List<Object> params = new ArrayList<>();
            List<Object> params = List.of(id);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return EditorialMapper.toEditorial(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Editorial> findAll() {
        try {
            String sql = "select * from editorial";
            ResultSet resultSet = Rawsql.select(sql, null);
            List<Editorial> editoriallist = new ArrayList<>();
            while (resultSet.next()) {
                editoriallist.add(EditorialMapper.toEditorial(resultSet));
            }
            return editoriallist;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer Id) {
        String sql = "DELETE FROM editorial WHERE id = ?";
        List<Object> params = List.of(Id);
        Rawsql.delete(sql, params);
    }

    @Override
    public void insert(Editorial editorial) {
        String sql = "INSERT VALUES INTO editorial (?,?)";
        List<Object> params = List.of(editorial.getId(),editorial.getName());
        Rawsql.insert(sql, params);
    }
}
