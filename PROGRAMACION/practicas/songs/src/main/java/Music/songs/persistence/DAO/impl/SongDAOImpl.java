package Music.songs.persistence.DAO.impl;

import Music.songs.domain.entity.Song;
import Music.songs.persistence.DAO.SongDAO;
import Music.songs.persistence.DAO.entity.SongEntity;

import java.util.ArrayList;
import java.util.List;

public class SongDAOImpl implements SongDAO{
    private List<SongEntity> songEntityList = new ArrayList<>();


    public SongDAOImpl() {
        songEntityList.add(new SongEntity(1, "November rain", 2005, 1));
        songEntityList.add(new SongEntity(2, "Cantares", 1996, 2));
        songEntityList.add(new SongEntity(3, "Saigo no Kyojin", 2023, 3));
        songEntityList.add(new SongEntity(4, "Un beso y una flor", 1973, 4));
    }


    @Override
    public List<SongEntity> getAll() {
        return this.songEntityList;
    }

    @Override
    public SongEntity findById(Integer id) {
        for(SongEntity songEntity : songEntityList){
            if (songEntity.getId() == id){
                return songEntity;
            }
        }
        return null;
    }
}
