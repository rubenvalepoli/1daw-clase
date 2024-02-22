package com.fpmislata.songsprueba.persistence.dao.impl;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.persistence.dao.ArtistDao;
import com.fpmislata.songsprueba.persistence.dao.SongDao;
import com.fpmislata.songsprueba.persistence.dao.entity.ArtistEntity;

import java.util.ArrayList;
import java.util.List;

public class ArtistDaoImpl implements ArtistDao {


    public List<ArtistEntity> artistEntitytList = new ArrayList<>();

    public ArtistDaoImpl(){
        artistEntitytList.add(new ArtistEntity(1,"Nino Bravo"));
        artistEntitytList.add(new ArtistEntity(2,"Pepe Clemente"));
        artistEntitytList.add(new ArtistEntity(3,"Bogo botraco"));
        artistEntitytList.add(new ArtistEntity(4,"Maldita Negra"));
    }


    @Override
    public List<ArtistEntity> all() {
        return this.artistEntitytList;
    }

    @Override
    public ArtistEntity findById(Integer id) {
        for (ArtistEntity artist : artistEntitytList){
            if (artist.getId() == id){
                return artist;
            }
        }
        return null;
    }

}
