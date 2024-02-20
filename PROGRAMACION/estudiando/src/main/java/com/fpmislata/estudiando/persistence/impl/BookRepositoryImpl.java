package com.fpmislata.estudiando.persistence.impl;


import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class BookRepositoryImpl implements BookRepository {



    List<Book> bookList = new ArrayList<>();


    public BookRepositoryImpl(){
        this.bookList.add(new Book(1,"El Quijote", new Author(1,"Cervantes")));
        this.bookList.add(new Book(2,"Sancho Panza", new Author(2, "Pepe")));
        this.bookList.add(new Book(3,"Panzeta", new Author(3, "Paco")));
    }



    @Override
    public List<Book> findall() {
        return this.bookList;
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
