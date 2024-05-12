package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.BookMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaobdImpl implements BookDao{

    @Override
    public List<Book> findAll(){
        try {
            List<Book> bookList = new ArrayList<>();
            ResultSet resultSet = Rawsql.select("select * from book;",null );

            while (resultSet.next()){
                bookList.add(BookMapper.toBook(resultSet));
            }
            return bookList;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book findBookById(int id){
        List<Object> listBookId = List.of(id);
        ResultSet resultSet = Rawsql.select("""
                select b.*, c.* from book b inner join characters c on b.id = c.book_id where b.id = ?;
                """, listBookId);
        try {
            resultSet.next();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return BookMapper.toBook(resultSet);
    }

    @Override
    public void deleteCharacterBooks(int id) {
        List<Object> deleteCharacterId = List.of(id);
        Rawsql.delete("DELETE FROM character WHERE book_id = ?", deleteCharacterId);
    }
    @Override
    public void deleteBook(int id) {
        List<Object> deleteBookId = List.of(id);
        Rawsql.delete("DELETE FROM book WHERE id = ?", deleteBookId);
    }


}
