package com.fpmislata.songsprueba.domine.service;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.domine.entity.Song;

import java.util.List;

public interface ArtistService {

    public List<Artist> getAll();

    public Artist findById(Integer id);
}
