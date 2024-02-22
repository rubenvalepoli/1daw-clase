package com.fpmislata.songsprueba.persistence.repository.impl;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.domine.entity.Song;
import com.fpmislata.songsprueba.persistence.dao.ArtistDao;
import com.fpmislata.songsprueba.persistence.dao.SongDao;
import com.fpmislata.songsprueba.persistence.dao.entity.SongEntity;
import com.fpmislata.songsprueba.persistence.dao.impl.ArtistDaoImpl;
import com.fpmislata.songsprueba.persistence.dao.impl.SongDaoImpl;
import com.fpmislata.songsprueba.persistence.repository.SongRepository;
import com.fpmislata.songsprueba.persistence.repository.mapper.ArtistMapper;
import com.fpmislata.songsprueba.persistence.repository.mapper.SongMapper;

import java.util.ArrayList;
import java.util.List;

public class SongRepositpryImpl implements SongRepository {

    private SongDao songDao;
    private ArtistDao artistDao;

    public SongRepositpryImpl(ArtistDao artistDao) {

        this.artistDao = artistDao;
    }

    public SongRepositpryImpl(SongDao songDao) {
        this.songDao = songDao;
    }




    @Override
    public List<Song> all() {

        List<SongEntity> songEntityList = songDao.all();
        List<Song> songList = new ArrayList<>();
        for (SongEntity songEntity : songEntityList){
            Artist artist = ArtistMapper.toArtist(artistDao.findById(songEntity.getArtistId()));
            Song song = SongMapper.toSong(songEntity);
            song.setArtist(artist);
            songList.add(song);
        }
        return songList;
    }

    @Override
    public Song findById(Integer id) {
        SongEntity songEntity = songDao.findById(id);
        Artist artist = ArtistMapper.toArtist(artistDao.findById(songEntity.getArtistId()));
        Song song = SongMapper.toSong(songEntity);
        song.setArtist(artist);
        return song;
    }
}
