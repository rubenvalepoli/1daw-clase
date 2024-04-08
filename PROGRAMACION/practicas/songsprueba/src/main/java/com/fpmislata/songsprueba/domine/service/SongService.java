package com.fpmislata.songsprueba.domine.service;

import com.fpmislata.songsprueba.domine.entity.Song;

import java.util.List;

public interface SongService {

    public List<Song> getAll();

    public Song findById(Integer id);
}
