package com.fpmislata.books.common.ioc;

import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.impl.BookServiceImpl;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.jdbc.impl.BookDaobdImpl;
import com.fpmislata.books.persistence.repository.BookRepository;
import com.fpmislata.books.persistence.repository.impl.BookRepositoryImpl;

public class BookIOC {
    private static BookService bookService;
    private static BookDao bookDao;
    private static BookRepository bookRepository;

    public static BookService getBookService(){
        if (bookService==null){
            bookService= new BookServiceImpl(getBookRepository());
        }
        return bookService;
    }



    public static BookDao getBookDao(){
        if (bookDao==null){
            bookDao= new BookDaobdImpl();
        }
        return bookDao;
    }



    public static BookRepository getBookRepository(){
        if (bookRepository == null) {
            bookRepository= new BookRepositoryImpl(getBookDao());
        }
        return bookRepository;

    }

}
