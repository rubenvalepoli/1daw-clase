package com.fpmislata.estudiando2.persistence.impl;

import com.fpmislata.estudiando2.domine.entity.Book;
import com.fpmislata.estudiando2.persistence.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    public List<Book> bookList = new ArrayList<>();

    public BookRepositoryImpl(){
        bookList.add(new Book(1,"Rosas","Pepe"));
        bookList.add(new Book(2,"Tulipanes","Pablo"));
        bookList.add(new Book(3,"Margaritas","Hector"));
    }

    @Override
    public List<Book> all() {return this.bookList;
    }

    @Override
    public Book id(Integer id) {
        for (Book book : bookList){
            if (book.getId() == id){
            return book;
            }
        }
        return null;
    }

    @Override
    public Book createbook(Book book) {
        bookList.add(book);
        return book;
    }
}
