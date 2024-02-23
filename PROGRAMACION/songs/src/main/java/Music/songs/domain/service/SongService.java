package Music.songs.domain.service;

import Music.songs.domain.entity.Song;

import java.util.List;

public interface SongService {
    public List<Song> getAll();
    public Song findById(Integer id);
}
