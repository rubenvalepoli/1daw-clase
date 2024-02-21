package com.fpmislata.estudiando.persistence.repository.impl;


import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.BookDao;
import com.fpmislata.estudiando.persistence.dao.impl.BookDaoImpl;
import com.fpmislata.estudiando.persistence.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;


public class BookRepositoryImpl implements BookRepository {



    private BookDao bookDao = new BookDaoImpl();



    @Override
    public List<Book> findall() {
        return null;
    }


    @Override
    public Book findById(int id) {
        for (Book book : bookList){
            if (book.getId() == id){
                return book;
            }
        }
        return null;
    }

    @Override
    public Book addBook(Book book) {
        bookList.add(book);
        return null;
    }


}
