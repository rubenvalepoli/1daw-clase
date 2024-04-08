package Music.songs.domain.service;

import Music.songs.domain.entity.Artist;

import java.util.List;

public interface ArtistService {

    public List<Artist> getAll();

    public Artist findById(Integer id);
}
