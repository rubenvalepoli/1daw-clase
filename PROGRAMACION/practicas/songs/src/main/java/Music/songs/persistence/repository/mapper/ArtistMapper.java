package Music.songs.persistence.repository.mapper;

import Music.songs.domain.entity.Artist;
import Music.songs.persistence.DAO.entity.ArtistEntity;

import java.util.ArrayList;
import java.util.List;

public class ArtistMapper {

    public static Artist toArtist(ArtistEntity artistEntity){
        if (artistEntity == null){
            return null;
        }
        return new Artist(
                artistEntity.getId(),
                artistEntity.getName()
        );
    }

    public static List<Artist> toArtistList(List<ArtistEntity> artistEntityList){
        List<Artist> artistList = new ArrayList<>();
        for (ArtistEntity artistEntity : artistEntityList){
            artistList.add(toArtist(artistEntity));
        }
        return artistList;
    }
}
