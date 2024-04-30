package com.fpmislata.examen2.common.container;

import com.fpmislata.examen2.domain.service.CharacterMovieService;
import com.fpmislata.examen2.domain.service.impl.CharacterMovieServiceImpl;
import com.fpmislata.examen2.persistence.dao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.dao.impl.CharacterMovieDaoImpl;
import com.fpmislata.examen2.persistence.repository.CharacterMovieRepository;
import com.fpmislata.examen2.persistence.repository.impl.CharacterMovieRepositoryImpl;

public class CharacterMovieIoC {

    private static CharacterMovieService characterMovieService;
    private static CharacterMovieRepository characterMovieRepository;
    private static CharacterMovieDao characterMovieDao;

    public static CharacterMovieDao getCharacterMovieDao(){
        if (characterMovieDao == null){
            characterMovieDao = new CharacterMovieDaoImpl();
        }
        return characterMovieDao;
    }
    public static CharacterMovieRepository getCharacterMovieRepository(){
        if (characterMovieRepository == null){
            characterMovieRepository = new CharacterMovieRepositoryImpl(getCharacterMovieDao());
        }
        return characterMovieRepository;
    }

    public static CharacterMovieService getCharacterMovieService(){
        if (characterMovieService == null){
            characterMovieService = new CharacterMovieServiceImpl(getCharacterMovieRepository());
        }
        return characterMovieService;
    }


}
