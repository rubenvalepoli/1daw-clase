package com.cipfpmislata.Ex3t_books.common.container;

import com.cipfpmislata.Ex3t_books.domain.service.AuthorService;
import com.cipfpmislata.Ex3t_books.domain.service.impl.AuthorServiceImpl;
import com.cipfpmislata.Ex3t_books.persistence.dao.AuthorDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.AuthorDaoJdbc;
import com.cipfpmislata.Ex3t_books.persistence.repository.AuthorRepository;
import com.cipfpmislata.Ex3t_books.persistence.repository.impl.AuthorRepositoryImpl;

public class AuthorIOC {
    public static AuthorDao authorDao;
    public static AuthorService authorService;
    public static AuthorRepository authorRepository;

    public static AuthorService getAuthorService() {
        if(authorService==null){
            authorService=new AuthorServiceImpl(getAuthorRepository());
        }
        return authorService;
    }

    public static void setAuthorService(AuthorService authorService) {
        AuthorIOC.authorService = authorService;
    }

    public static AuthorRepository getAuthorRepository() {
        if(authorRepository==null){
            authorRepository=new AuthorRepositoryImpl(getAuthorDao());
        }
        return authorRepository;
    }

    public static void setAuthorRepository(AuthorRepository authorRepository) {
        AuthorIOC.authorRepository = authorRepository;
    }

    public static AuthorDao getAuthorDao() {
        if (authorDao == null){
            authorDao = new AuthorDaoJdbc();
        }
        return authorDao;
    }

    public static void setAuthorDao(AuthorDao authorDao) {
        AuthorIOC.authorDao = authorDao;
    }
}
