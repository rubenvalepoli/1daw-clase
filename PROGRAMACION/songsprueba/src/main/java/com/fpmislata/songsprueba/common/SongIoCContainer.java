package com.fpmislata.songsprueba.common;

import com.fpmislata.songsprueba.domine.service.ArtistService;
import com.fpmislata.songsprueba.domine.service.SongService;
import com.fpmislata.songsprueba.domine.service.impl.ArtistServiceImpl;
import com.fpmislata.songsprueba.domine.service.impl.SongServiceImpl;
import com.fpmislata.songsprueba.persistence.dao.ArtistDao;
import com.fpmislata.songsprueba.persistence.dao.SongDao;
import com.fpmislata.songsprueba.persistence.dao.impl.ArtistDaoImpl;
import com.fpmislata.songsprueba.persistence.dao.impl.SongDaoImpl;
import com.fpmislata.songsprueba.persistence.repository.ArtistRepository;
import com.fpmislata.songsprueba.persistence.repository.SongRepository;
import com.fpmislata.songsprueba.persistence.repository.impl.ArtistRepositoryImpl;
import com.fpmislata.songsprueba.persistence.repository.impl.SongRepositpryImpl;

public class SongIoCContainer {

    private static SongService songService;
    private static SongRepository songRepository;
    private static SongDao songDao;




    public static SongDao getSongDao(){
        if (songDao == null){
            songDao = new SongDaoImpl();
        }
        return songDao;
    }


    public static SongRepository getSongRepository() {
        if (songRepository == null){
            songRepository = new SongRepositpryImpl(getSongDao());
        }
        return songRepository;
    }


    public static SongService getSongService() {
        if (songService == null){
            songService = new SongServiceImpl(getSongRepository());
        }
        return songService;
    }



}
