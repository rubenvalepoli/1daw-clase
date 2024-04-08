package Music.songs.persistence.repository;

import Music.songs.domain.entity.Artist;

import java.util.List;

public interface ArtistRepository {

    public List<Artist> getAll();

    public Artist findById(Integer id);
}
