package Music.songs.domain.service.impl;

import Music.songs.domain.entity.Artist;
import Music.songs.domain.service.ArtistService;
import Music.songs.persistence.repository.ArtistRepository;

import java.util.List;

public class ArtistServiceImpl implements ArtistService {
    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    private ArtistRepository artistRepository;

    @Override
    public List<Artist> getAll() {
        return this.artistRepository.getAll();
    }

    @Override
    public Artist findById(Integer id) {
        return this.artistRepository.findById(id);
    }


}
