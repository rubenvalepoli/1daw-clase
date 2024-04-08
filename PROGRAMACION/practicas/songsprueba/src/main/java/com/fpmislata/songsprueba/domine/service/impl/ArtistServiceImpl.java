package com.fpmislata.songsprueba.domine.service.impl;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.domine.service.ArtistService;
import com.fpmislata.songsprueba.persistence.repository.ArtistRepository;

import java.util.List;

public class ArtistServiceImpl implements ArtistService {

    ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> getAll() {
        return this.artistRepository.all();
    }

    @Override
    public Artist findById(Integer id) {
        return this.artistRepository.findById(id);
    }
}
