package Music.songs.common;

import Music.songs.domain.service.ArtistService;
import Music.songs.domain.service.SongService;
import Music.songs.domain.service.impl.ArtistServiceImpl;
import Music.songs.domain.service.impl.SongServiceImpl;
import Music.songs.persistence.DAO.ArtistDAO;
import Music.songs.persistence.DAO.SongDAO;
import Music.songs.persistence.DAO.impl.ArtistDAOImpl;
import Music.songs.persistence.DAO.impl.SongDAOImpl;
import Music.songs.persistence.repository.ArtistRepository;
import Music.songs.persistence.repository.SongRepository;
import Music.songs.persistence.repository.impl.ArtistRepositoryImpl;
import Music.songs.persistence.repository.impl.SongRepositoryImpl;

public class SongIoCContainer {

    private static SongService songService;
    private static SongRepository songRepository;
    private static SongDAO songDAO;

    public static SongDAO getSongDAO(){
        if (songDAO == null){
            songDAO = new SongDAOImpl();
        }
        return songDAO;
    }
    public static SongRepository getSongRepository(){
        if (songRepository == null){
            songRepository = new SongRepositoryImpl(getSongDAO());
        }
        return songRepository;
    }

    public static SongService getSongService(){
        if (songService == null){
            songService = new SongServiceImpl(getSongRepository());
        }
        return songService;
    }

}
