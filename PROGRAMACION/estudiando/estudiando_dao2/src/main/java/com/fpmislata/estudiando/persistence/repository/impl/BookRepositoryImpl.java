package com.fpmislata.estudiando.persistence.repository.impl;


import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.BookDao;
import com.fpmislata.estudiando.persistence.dao.entity.BookEntity;
import com.fpmislata.estudiando.persistence.dao.impl.BookDaoImpl;
import com.fpmislata.estudiando.persistence.repository.BookRepository;
import com.fpmislata.estudiando.persistence.repository.mapper.BookMapper;

import java.util.ArrayList;
import java.util.List;


public class BookRepositoryImpl implements BookRepository {



    private BookDao bookDao = new BookDaoImpl();



    @Override
    public List<Book> findAll() {
        List<BookEntity> bookEntityList = bookDao.findAll();
        List<Book> bookList = new ArrayList<>();
        for (BookEntity bookEntity : bookEntityList){
            Book book = BookMapper.toBook(bookEntity);
            bookList.add(book);
        }
        return bookList;
    }

    @Override
    public Book findById(int id) {
        Book book = BookMapper.toBook(bookDao.findById(id));
        return book;
    }

    @Override
    public Book addBook(Book book) {
        return null;
    }




    /*@Override
    public Book findById(int id) {

        Book bookEntity = bookDao.findById(id);
        Book book = BookMapper.toBook(bookDao);
        return book;

        //return BookMapper.toBooklist(bookDao.findById(id));
    }

    @Override
    public Book addBook(Book book) {

    }*/


}
