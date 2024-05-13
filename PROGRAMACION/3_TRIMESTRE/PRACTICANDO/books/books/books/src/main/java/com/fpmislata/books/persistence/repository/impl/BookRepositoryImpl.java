package com.fpmislata.books.persistence.repository.impl;

import com.fpmislata.books.common.ioc.AuthorIOC;
import com.fpmislata.books.common.ioc.CharacterMovieIOC;
import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.persistence.Dao.AuthorDao;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.repository.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private BookDao bookDao;
    private AuthorDao authorDao = AuthorIOC.getAuthorDao();
    private CharacterMovieDao characterMovieDao = CharacterMovieIOC.getCharacterMovieDao();

    public BookRepositoryImpl(BookDao bookDao){
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> findAll(){
        List<Book> bookList = bookDao.findAll();
        return bookList;
    }

    @Override
    public Book findBookById(int id){
        Book book = bookDao.findBookById(id);
        List<CharacterMovie> characterMovieList = characterMovieDao.findCharacterByBookId(id);
        book.setCharacterMovieList(characterMovieList);
        return book;
    }

    @Override
    public void deleteBook(int id){
        bookDao.deleteBook(id);
    }

    @Override
    public void update (Book book){
        bookDao.update(book);
    }








}
