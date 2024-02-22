package com.fpmislata.songsprueba.domine.service.impl;

import com.fpmislata.songsprueba.domine.entity.Song;
import com.fpmislata.songsprueba.domine.service.SongService;
import com.fpmislata.songsprueba.persistence.repository.SongRepository;

import java.util.List;

public class SongServiceImpl implements SongService {

    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }


    @Override
    public List<Song> getAll() {
        return this.songRepository.all();
    }

    @Override
    public Song findById(Integer id) {
        return this.songRepository.findById(id);
    }
}
