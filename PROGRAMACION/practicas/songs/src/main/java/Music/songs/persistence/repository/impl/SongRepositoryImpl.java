package Music.songs.persistence.repository.impl;

import Music.songs.domain.entity.Artist;
import Music.songs.domain.entity.Song;
import Music.songs.persistence.DAO.ArtistDAO;
import Music.songs.persistence.DAO.SongDAO;
import Music.songs.persistence.DAO.entity.SongEntity;
import Music.songs.persistence.DAO.impl.ArtistDAOImpl;
import Music.songs.persistence.DAO.impl.SongDAOImpl;
import Music.songs.persistence.repository.SongRepository;
import Music.songs.persistence.repository.mapper.ArtistMapper;
import Music.songs.persistence.repository.mapper.SongMapper;

import java.util.ArrayList;
import java.util.List;

public class SongRepositoryImpl implements SongRepository {

    private SongDAO songDAO;
    private ArtistDAO artistDAO = new ArtistDAOImpl();

    public SongRepositoryImpl(SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    @Override
    public List<Song> getAll() {
        List<SongEntity> songEntityList = songDAO.getAll();
        List<Song> songList = new ArrayList<>();
        for (SongEntity songEntity: songEntityList){
            Artist artist = ArtistMapper.toArtist(artistDAO.findById(songEntity.getArtistId()));
            Song song = SongMapper.toSong(songEntity);
            song.setArtist(artist);
            songList.add(song);
        }
        return songList;
    }

    @Override
    public Song findById(Integer id) {
        SongEntity songEntity = songDAO.findById(id);
        Artist artist = ArtistMapper.toArtist(artistDAO.findById(songEntity.getArtistId()));
        Song song = SongMapper.toSong(songEntity);
        song.setArtist(artist);
        return song;
    }
}
