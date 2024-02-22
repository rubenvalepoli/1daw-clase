package com.fpmislata.songsprueba.persistence.repository;

import com.fpmislata.songsprueba.domine.entity.Song;

import java.util.List;

public interface SongRepository {

    public List<Song> all();

    public Song findById(Integer id);


}
