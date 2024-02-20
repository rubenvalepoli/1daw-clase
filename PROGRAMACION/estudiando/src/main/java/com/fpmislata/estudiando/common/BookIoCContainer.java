package com.fpmislata.estudiando.common;

import com.fpmislata.estudiando.domain.service.BooksService;
import com.fpmislata.estudiando.domain.service.impl.BooksServiceImpl;
import com.fpmislata.estudiando.persistence.BookRepository;
import com.fpmislata.estudiando.persistence.impl.BookRepositoryImpl;

public class BookIoCContainer {
    private static BooksService booksService;
    private static BookRepository bookRepository;


    public static BooksService getBooksService() {
        if (booksService == null){
            booksService = new BooksServiceImpl(getBookRepository());
        }
        return booksService;
    }

    public static BookRepository getBookRepository() {
        if (bookRepository == null){
            bookRepository = new BookRepositoryImpl();
        }
        return bookRepository;
    }
}
