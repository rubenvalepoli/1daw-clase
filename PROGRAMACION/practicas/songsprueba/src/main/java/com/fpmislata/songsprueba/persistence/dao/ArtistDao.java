package com.fpmislata.songsprueba.persistence.dao;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.persistence.dao.entity.ArtistEntity;

import java.util.List;

public interface ArtistDao {

    public List<ArtistEntity> all();

    public ArtistEntity findById(Integer id);


}
