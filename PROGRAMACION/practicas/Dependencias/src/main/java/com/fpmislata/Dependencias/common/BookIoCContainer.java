package com.fpmislata.Dependencias.common;

import com.fpmislata.Dependencias.domine.service.BookService;
import com.fpmislata.Dependencias.domine.service.impl.BooksServiceImpl;
import com.fpmislata.Dependencias.persistence.BookRepository;
import com.fpmislata.Dependencias.persistence.impl.StaticBookRepositoryImpl;

public class BookIoCContainer {

    private static BookService bookService;
    private static BookRepository bookRepository;

    private static BookService getBookService() {
        if(bookService == null) {
            bookService = new BooksServiceImpl(getBookRepository());
        }
        return bookService;
    }

    public static BookRepository getBookRepository() {
        if(bookRepository == null) {
            bookRepository = new StaticBookRepositoryImpl();
        }
        return bookRepository;
    }
}
