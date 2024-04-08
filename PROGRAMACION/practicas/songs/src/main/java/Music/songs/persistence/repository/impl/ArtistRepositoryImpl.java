package Music.songs.persistence.repository.impl;

import Music.songs.domain.entity.Artist;
import Music.songs.domain.entity.Song;
import Music.songs.persistence.DAO.ArtistDAO;
import Music.songs.persistence.DAO.entity.ArtistEntity;
import Music.songs.persistence.DAO.entity.SongEntity;
import Music.songs.persistence.DAO.impl.ArtistDAOImpl;
import Music.songs.persistence.repository.ArtistRepository;
import Music.songs.persistence.repository.mapper.ArtistMapper;
import Music.songs.persistence.repository.mapper.SongMapper;

import java.util.ArrayList;
import java.util.List;

public class ArtistRepositoryImpl implements ArtistRepository{

    private ArtistDAO artistDAO;

    public ArtistRepositoryImpl(ArtistDAO artistDAO) {
        this.artistDAO = artistDAO;
    }

    @Override
    public List<Artist> getAll() {
        List<ArtistEntity> artistEntityList = artistDAO.getAll();
        List<Artist> artistList = new ArrayList<>();
        for (ArtistEntity artistEntity: artistEntityList){
            Artist artist = ArtistMapper.toArtist(artistEntity);
            artistList.add(artist);
        }
        return artistList;
    }

    @Override
    public Artist findById(Integer id) {
        ArtistEntity artistEntity = artistDAO.findById(id);
        Artist artist = ArtistMapper.toArtist(artistEntity);
        return artist;
    }
}
