package com.cipfpmislata.Ex3t_books.persistence.dao.jdbc;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.persistence.dao.BooksDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.db.Rawsql;
import com.cipfpmislata.Ex3t_books.persistence.dao.mapper.BookMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
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
            throw new RuntimeException("Error al encontrar el libro",e);
        }
    }

    @Override
    public List<Books> findAll() {
        String sql = "select * from book";
        ResultSet resultSet = Rawsql.select(sql, null);
        return BookMapper.toBookList(resultSet);
    }

    @Override
    public List<Books> findAllByTitle(String title) {
        String sql = "SELECT * FROM book WHERE LOWER(title) LIKE ?";
        title="%"+title+"%";
        List<Object> params = List.of(title);
        ResultSet resultSet = Rawsql.select(sql, params);
        return BookMapper.toBookList(resultSet);
    }


    @Override
    public List<Books> findAllByYear(Integer year) {
        String sql = "SELECT * FROM book where year =?";
        List<Object> params = List.of(year);
        ResultSet resultSet = Rawsql.select(sql, params);
        return BookMapper.toBookList(resultSet);
    }

    @Override
    public void insert(Books books) {
        String sql = " INSERT INTO book (title,year,author_id,editorial_id) VALUES(?,?,?,?)";
        List<Object> params = List.of(books.getTitle(),books.getYear(),books.getAuthor().getId(),books.getEditorial().getId());
        Rawsql.insert(sql,params);
    }

    @Override
    public void update(Books books) {
        String sql ="UPDATE book SET title = ?, year = ?, editorial_id = ? WHERE id= ?";
        List<Object> params = List.of(books.getTitle(),books.getYear(),books.getEditorial().getId(),books.getId());
        Rawsql.update(sql,params);
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM book WHERE id=?";
        List<Object> params = List.of(id);
        Rawsql.delete(sql, params);
    }

}
