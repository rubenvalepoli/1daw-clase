package com.fpmislata.songsprueba.persistence.repository;

import com.fpmislata.songsprueba.domine.entity.Artist;

import java.util.List;

public interface ArtistRepository {

    public List<Artist> all();

    public Artist findById(Integer id);



}
