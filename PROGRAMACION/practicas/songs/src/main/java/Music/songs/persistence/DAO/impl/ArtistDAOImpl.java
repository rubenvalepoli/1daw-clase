package Music.songs.persistence.DAO.impl;

import Music.songs.domain.entity.Artist;
import Music.songs.persistence.DAO.ArtistDAO;
import Music.songs.persistence.DAO.entity.ArtistEntity;

import java.util.ArrayList;
import java.util.List;

public class ArtistDAOImpl implements ArtistDAO {
    private List<ArtistEntity> artistEntityList = new ArrayList<>();


    public ArtistDAOImpl() {
        artistEntityList.add(new ArtistEntity(1, "Guns N'Roses"));
        artistEntityList.add(new ArtistEntity(2, "Joan Manuel Serrat"));
        artistEntityList.add(new ArtistEntity(3, "Linked Horizon"));
        artistEntityList.add(new ArtistEntity(4, "Nino Bravo"));
    }


    @Override
    public List<ArtistEntity> getAll() {
        return this.artistEntityList;
    }

    @Override
    public ArtistEntity findById(int id) {
        for (ArtistEntity artistEntity : artistEntityList){
            if (id == artistEntity.getId()){
                return artistEntity;
            }
        }
        return null;
    }
}
