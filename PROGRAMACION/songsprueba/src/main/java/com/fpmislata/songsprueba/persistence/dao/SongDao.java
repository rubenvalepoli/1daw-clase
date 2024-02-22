package com.fpmislata.songsprueba.persistence.dao;

import com.fpmislata.songsprueba.domine.entity.Song;
import com.fpmislata.songsprueba.persistence.dao.entity.SongEntity;

import java.util.List;

public interface SongDao {

    public List<SongEntity> all();

    public SongEntity findById(Integer id);

}
