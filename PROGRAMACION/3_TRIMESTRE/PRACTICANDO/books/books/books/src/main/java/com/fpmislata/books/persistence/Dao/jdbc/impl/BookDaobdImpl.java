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
        Book book = BookMapper.toBook(resultSet);
        return book;
    }

    @Override
    public void deleteBook(int id){
        List<Object> idBook = List.of(id);
        Rawsql.delete("DELETE FROM author_book WHERE book_id = ?", idBook);
        Rawsql.delete("DELETE FROM characters WHERE book_id = ?", idBook);
        Rawsql.delete("DELETE FROM BOOK WHERE id = ?", idBook);

    }

    @Override
    public void update(Book book){
        List<Object> params = List.of(book.getId(),book.getName(),book.getYear(),book.getEditorial());
        Rawsql.update("UPDATE book SET name = ?, year = ?, editorial_id = ? WHERE id = ?", params);
    }

}
