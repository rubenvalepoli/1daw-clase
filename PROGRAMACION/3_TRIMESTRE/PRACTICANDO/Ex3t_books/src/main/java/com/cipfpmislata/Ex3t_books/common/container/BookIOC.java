package com.cipfpmislata.Ex3t_books.common.container;

import com.cipfpmislata.Ex3t_books.domain.service.BooksService;
import com.cipfpmislata.Ex3t_books.domain.service.impl.BookServiceImpl;
import com.cipfpmislata.Ex3t_books.persistence.zdao.BooksDao;
import com.cipfpmislata.Ex3t_books.persistence.zdao.jdbc.BookDaoJdbc;
import com.cipfpmislata.Ex3t_books.persistence.repository.BookRepository;
import com.cipfpmislata.Ex3t_books.persistence.repository.impl.BookRepositoryImpl;

public class BookIOC {
    public static BooksService booksService;
    public static BookRepository bookRepository;
    public static BooksDao booksDao;

   public static BooksService getBooksService(){
       if (booksService==null){
           booksService= new BookServiceImpl(getBookRepository());
       }
       return booksService;
   }
   public static BookRepository getBookRepository(){
       if (bookRepository==null){
           bookRepository = new BookRepositoryImpl(getBooksDao());
       }
       return bookRepository;
   }
   public static BooksDao getBooksDao(){
       if(booksDao==null){
           booksDao= new BookDaoJdbc();
       }
       return booksDao;
   }

}
