package com.fpmislata.estudiando.common;

import com.fpmislata.estudiando.domain.service.AuthorService;
import com.fpmislata.estudiando.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.estudiando.persistence.repository.AuthorRepository;
import com.fpmislata.estudiando.persistence.repository.impl.AuthorRepositoryImpl;

public class AuthorIoCContainer {

    private static AuthorService authorService;
    private static AuthorRepository authorRepository;

    public static AuthorService getAuthorService(){
        if (authorService == null){
            authorService = new AuthorServiceImpl(getAuthorRepository());
        }
        return authorService;
    }


    public static AuthorRepository getAuthorRepository(){
        if (authorRepository == null){
            authorRepository = new AuthorRepositoryImpl();
        }
        return authorRepository;
    }

}
