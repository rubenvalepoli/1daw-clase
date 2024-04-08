package com.fpmislata.estudiando.common;

import com.fpmislata.estudiando.domain.service.BooksService;
import com.fpmislata.estudiando.domain.service.impl.BooksServiceImpl;
import com.fpmislata.estudiando.persistence.dao.BookDao;
import com.fpmislata.estudiando.persistence.repository.BookRepository;
import com.fpmislata.estudiando.persistence.repository.impl.BookRepositoryImpl;

public class BookIoCContainer {
    private static BooksService booksService;
    private static BookRepository bookRepository;


    public static BookRepository getBookRepository() {
        if (bookRepository == null){
            bookRepository = new BookRepositoryImpl();
        }
        return bookRepository;
    }

    public static BooksService getBooksService() {
        if (booksService == null){
            booksService = new BooksServiceImpl(getBookRepository());
        }
        return booksService;
    }
}
