package Music.songs.common;

import Music.songs.domain.service.ArtistService;
import Music.songs.domain.service.impl.ArtistServiceImpl;
import Music.songs.persistence.DAO.ArtistDAO;
import Music.songs.persistence.DAO.impl.ArtistDAOImpl;
import Music.songs.persistence.repository.ArtistRepository;
import Music.songs.persistence.repository.impl.ArtistRepositoryImpl;

public class ArtistIoCContainer {

    private static ArtistService artistService;
    private static ArtistRepository artistRepository;
    private static ArtistDAO artistDao;

    public static ArtistDAO getArtistDao(){
        if (artistDao == null){
            artistDao = new ArtistDAOImpl();
        }
        return artistDao;
    }

    public static ArtistRepository getArtistRepository(){
        if (artistRepository == null){
            artistRepository = new ArtistRepositoryImpl(getArtistDao());
        }
        return artistRepository;
    }

    public static ArtistService getArtistService(){
        if (artistService == null){
            artistService = new ArtistServiceImpl(getArtistRepository());
        }
        return artistService;
    }

}
