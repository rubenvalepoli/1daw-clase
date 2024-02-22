package com.fpmislata.songsprueba.persistence.dao.impl;

import com.fpmislata.songsprueba.domine.entity.Song;
import com.fpmislata.songsprueba.persistence.dao.SongDao;
import com.fpmislata.songsprueba.persistence.dao.entity.SongEntity;

import java.util.ArrayList;
import java.util.List;

public class SongDaoImpl implements SongDao {

    public List<SongEntity> songEntityList = new ArrayList<>();

    public SongDaoImpl(){
        songEntityList.add(new SongEntity(1,"Un beso y una flor",1973,1));
        songEntityList.add(new SongEntity(2,"Me matas",2020,2));
        songEntityList.add(new SongEntity(3,"Todos los dias sale el sol",2010,3));
        songEntityList.add(new SongEntity(4,"Sirenas",2013,4));
    }


    @Override
    public List<SongEntity> all() {
        return this.songEntityList;
    }

    @Override
    public SongEntity findById(Integer id) {
        for (SongEntity songEntity : songEntityList){
            if (songEntity.getId() == id){
                return songEntity;
            }
        }
        return null;
    }
}
