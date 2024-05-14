package com.fpmislata.books.persistence.Dao.jdbc.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.jdbc.bd.Rawsql;
import com.fpmislata.books.persistence.Dao.jdbc.mapper.BookMapper;
import org.springframework.validation.ObjectError;

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


    //ESTA ES LA QUE NO FUNCIONA, QUE NO ENCUENTRA LA COLUMNA ID
    @Override
    public void create (Book book){
        String sql = "Insert into book (name, year, editorial_id) Values (?, ?, ?)";
        String sq2 = "Insert into characters (name, book_id) VALUES (?, ?)";
        List<Object> params = List.of(book.getName(), book.getYear(), book.getEditorial().getId());
        Rawsql.insert(sql, params);
        ResultSet resultSet = Rawsql.select("Select MAX(id) from book", null);
        try {
            resultSet.next();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        Book book1 = BookMapper.toBookOnlyId(resultSet);
        for (CharacterMovie characterMovie : book.getCharacterMovieList()){
            List<Object> params2 = List.of(characterMovie.getName(), book1.getId());
            Rawsql.insert(sq2, params2);
        }
    }

}
