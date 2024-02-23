package Music.songs.domain.service.impl;

import Music.songs.domain.entity.Song;
import Music.songs.domain.service.SongService;
import Music.songs.persistence.repository.SongRepository;

import java.util.List;

public class SongServiceImpl implements SongService {

    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAll(){
        return this.songRepository.getAll();
    }

    @Override
    public Song findById(Integer id) {
        return this.songRepository.findById(id);
    }
}
