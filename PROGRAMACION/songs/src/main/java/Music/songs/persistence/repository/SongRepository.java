package Music.songs.persistence.repository;

import Music.songs.domain.entity.Song;

import java.util.List;

public interface SongRepository {

    public List<Song> getAll();

    public Song findById(Integer id);
}
