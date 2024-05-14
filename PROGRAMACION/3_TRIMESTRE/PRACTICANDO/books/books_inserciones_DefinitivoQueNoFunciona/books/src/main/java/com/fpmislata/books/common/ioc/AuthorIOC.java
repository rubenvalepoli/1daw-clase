package com.fpmislata.books.common.ioc;

import com.fpmislata.books.domain.service.AuthorService;
import com.fpmislata.books.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.books.persistence.Dao.AuthorDao;
import com.fpmislata.books.persistence.Dao.jdbc.impl.AuthorDaobdImpl;
import com.fpmislata.books.persistence.repository.AuthorRepository;
import com.fpmislata.books.persistence.repository.impl.AuthorRepositoryImpl;

public class AuthorIOC {

    private static AuthorService authorService;
    private static AuthorRepository authorRepository;
    private static AuthorDao authorDao;

    public static AuthorDao getAuthorDao(){
        if (authorDao == null){
            authorDao = new AuthorDaobdImpl();
        }
        return authorDao;
    }

    public static AuthorRepository getAuthorRepository(){
        if (authorRepository == null){
            authorRepository = new AuthorRepositoryImpl(getAuthorDao());
        }
        return authorRepository;
    }

    public static AuthorService getAuthorService(){
        if (authorService == null){
            authorService = new AuthorServiceImpl(getAuthorRepository());
        }
        return authorService;
    }

}
