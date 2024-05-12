package com.cipfpmislata.Ex3t_books.persistence.zdao.jdbc;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.persistence.zdao.BooksDao;
import com.cipfpmislata.Ex3t_books.persistence.zdao.jdbc.db.Rawsql;
import com.cipfpmislata.Ex3t_books.persistence.zdao.mapper.BookMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoJdbc implements BooksDao {
    @Override
    public Books findById(Integer id) {
        try {
            String sql = "select * from book where id=?";
            List<Object> params = List.of(id);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return BookMapper.toBooks(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException("Error al encontrar los libros",e);
        }
    }

    @Override
    public List<Books> findAll() {
        try {
            String sql = "select * from book";
            ResultSet resultSet = Rawsql.select(sql, null);
            List<Books> bookslist = new ArrayList<>();
            while (resultSet.next()) {
                bookslist.add(BookMapper.toBooks(resultSet));
            }
            return bookslist;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Books> findAllByName(String name) {
        try {
            String sql = "SELECT * FROM books WHERE name LIKE ?";
            List<Object> params = List.of(name);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return BookMapper.toBookList(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Books> findAllByCharacterName(String name) {
        try {
            String sql = "select * from book b inner join characters c on b.character_id=c.id where c.name=?";
            List<Object> params = List.of(name);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return BookMapper.toBookList(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Books> findAllByYear(Integer year) {
        try {
            String sql = "SELECT * FROM book where year =?";
            List<Object> params = List.of(year);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return BookMapper.toBookList(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(Books books) {
        String sql = " INSERT INTO book VALUES(?,?,?)";
        List<Object> params = List.of(books.getId(),books.getName(),books.getYear());
        Rawsql.insert(sql,params);
    }

    @Override
    public void update(Books books) {

    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from book where id=?";
        List<Object> params = List.of(id);
        Rawsql.delete(sql, params);
    }

}
