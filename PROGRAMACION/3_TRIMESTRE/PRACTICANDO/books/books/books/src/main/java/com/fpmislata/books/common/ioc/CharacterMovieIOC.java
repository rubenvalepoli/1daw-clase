package com.fpmislata.books.common.ioc;

import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.impl.BookServiceImpl;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.CharacterMovieDao;
import com.fpmislata.books.persistence.Dao.jdbc.impl.BookDaobdImpl;
import com.fpmislata.books.persistence.Dao.jdbc.impl.CharacterMovieDaobdImpl;
import com.fpmislata.books.persistence.repository.BookRepository;
import com.fpmislata.books.persistence.repository.impl.BookRepositoryImpl;

public class CharacterMovieIOC {

    private static CharacterMovieDao characterMovieDao;

    public static CharacterMovieDao getCharacterMovieDao(){
        if (characterMovieDao==null){
            characterMovieDao= new CharacterMovieDaobdImpl();
        }
        return characterMovieDao;
    }
}
