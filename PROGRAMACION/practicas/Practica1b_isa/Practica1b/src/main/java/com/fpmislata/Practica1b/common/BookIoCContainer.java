package com.fpmislata.Practica1b.common;

import com.fpmislata.Practica1b.domain.service.BookService;
import com.fpmislata.Practica1b.domain.service.impl.BooksServiceImpl;
import com.fpmislata.Practica1b.persistence.BookRepository;
import com.fpmislata.Practica1b.persistence.impl.StaticBookRepositoryImpl;

public class BookIoCContainer {



    private static BookService bookService;
    private static BookRepository bookRepository;

    public static BookService getBookService(){
        if (bookService == null){
            bookService = new BooksServiceImpl(getBookRepository());
        }
        return bookService;
    }

    public static BookRepository getBookRepository(){
        if (bookRepository == null){
            bookRepository = new StaticBookRepositoryImpl();
        }
        return bookRepository;
    }

}
