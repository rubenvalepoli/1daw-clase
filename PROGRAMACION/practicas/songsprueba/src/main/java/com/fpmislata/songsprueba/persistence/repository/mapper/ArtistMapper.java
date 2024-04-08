package com.fpmislata.songsprueba.persistence.repository.mapper;

import com.fpmislata.songsprueba.domine.entity.Artist;
import com.fpmislata.songsprueba.persistence.dao.entity.ArtistEntity;

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
