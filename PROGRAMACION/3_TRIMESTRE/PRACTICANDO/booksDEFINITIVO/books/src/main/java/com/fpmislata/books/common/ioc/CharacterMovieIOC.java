package com.fpmislata.books.common.ioc;

import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.CharacterMovieService;
import com.fpmislata.books.domain.service.impl.BookServiceImpl;
import com.fpmislata.books.domain.service.impl.CharacterMovieServiceImpl;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.Dao.jdbc.impl.BookDaobdImpl;
import com.fpmislata.books.persistence.Dao.jdbc.impl.CharacterMovieDaobdImpl;
import com.fpmislata.books.persistence.repository.BookRepository;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;
import com.fpmislata.books.persistence.repository.impl.BookRepositoryImpl;
import com.fpmislata.books.persistence.repository.impl.CharacterMovieRepositoryImpl;

public class CharacterMovieIOC {

    private static CharacterMovieDao characterMovieDao;
    private static CharacterMovieRepository characterMovieRepository;

    private static CharacterMovieService characterMovieService;


    public static CharacterMovieDao getCharacterMovieDao(){
        if (characterMovieDao==null){
            characterMovieDao= new CharacterMovieDaobdImpl();
        }
        return characterMovieDao;
    }

    public static CharacterMovieRepository getCharacterMovieRepository(){
        if (characterMovieRepository==null){
            characterMovieRepository= new CharacterMovieRepositoryImpl(getCharacterMovieDao());
        }
        return characterMovieRepository;
    }

    public static CharacterMovieService getCharacterMovieService(){
        if (characterMovieService==null){
            characterMovieService= new CharacterMovieServiceImpl(getCharacterMovieRepository());
        }
        return characterMovieService;
    }
}
