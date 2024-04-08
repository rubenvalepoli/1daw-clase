package com.fpmislata.songsprueba.common;

import com.fpmislata.songsprueba.domine.service.ArtistService;
import com.fpmislata.songsprueba.domine.service.impl.ArtistServiceImpl;
import com.fpmislata.songsprueba.persistence.dao.ArtistDao;
import com.fpmislata.songsprueba.persistence.dao.impl.ArtistDaoImpl;
import com.fpmislata.songsprueba.persistence.repository.ArtistRepository;
import com.fpmislata.songsprueba.persistence.repository.impl.ArtistRepositoryImpl;

public class ArtistIoCContainer {

    private static ArtistService artistService;
    private static ArtistRepository artistRepository;
    private static ArtistDao artistDao;

    public static ArtistDao getArtistDao(){
        if (artistDao == null){
            artistDao = new ArtistDaoImpl();
        }
        return artistDao;
    }



    public static ArtistRepository getArtistRepository(){
        if (artistRepository == null){
            artistRepository = new ArtistRepositoryImpl(getArtistDao());
        }
        return artistRepository;
    }

    public static ArtistService getArtistService(){
        if (artistService == null){
            artistService = new ArtistServiceImpl(getArtistRepository());
        }
        return artistService;
    }


}
