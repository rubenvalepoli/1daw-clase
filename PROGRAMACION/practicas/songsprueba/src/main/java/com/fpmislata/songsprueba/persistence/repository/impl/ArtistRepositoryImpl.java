package com.fpmislata.songsprueba.persistence.repository.impl;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.domine.entity.Song;
import com.fpmislata.songsprueba.persistence.dao.ArtistDao;
import com.fpmislata.songsprueba.persistence.dao.entity.ArtistEntity;
import com.fpmislata.songsprueba.persistence.dao.entity.SongEntity;
import com.fpmislata.songsprueba.persistence.dao.impl.ArtistDaoImpl;
import com.fpmislata.songsprueba.persistence.repository.ArtistRepository;
import com.fpmislata.songsprueba.persistence.repository.mapper.ArtistMapper;
import com.fpmislata.songsprueba.persistence.repository.mapper.SongMapper;

import java.util.ArrayList;
import java.util.List;

public class ArtistRepositoryImpl  implements ArtistRepository {

    private ArtistDao artistDao;

    public ArtistRepositoryImpl(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    @Override
    public List<Artist> all() {
        List<ArtistEntity> artistEntityList = artistDao.all();
        List<Artist> artistList = new ArrayList<>();
        for (ArtistEntity artistEntity : artistEntityList) {
            Artist artist = ArtistMapper.toArtist(artistEntity);
            artistList.add(artist);
        }
        return artistList;
    }

    @Override
    public Artist findById(Integer id) {
        ArtistEntity artistEntity = artistDao.findById(id);
        Artist artist = ArtistMapper.toArtist(artistEntity);
        return artist;
    }
}
