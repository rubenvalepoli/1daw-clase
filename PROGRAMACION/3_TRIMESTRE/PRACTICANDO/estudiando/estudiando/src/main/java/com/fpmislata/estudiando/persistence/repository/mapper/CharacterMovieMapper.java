package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.CharacterMovie;
import com.fpmislata.estudiando.persistence.dao.entity.CharacterMovieEntity;

import java.util.ArrayList;
import java.util.List;

public class CharacterMovieMapper {
    public static CharacterMovie toCharacterMovie(CharacterMovieEntity characterMovieEntity){
        if (characterMovieEntity ==null){
            return null;
        }
        return new CharacterMovie(
                characterMovieEntity.getId(),
                characterMovieEntity.getCharacterName()
        );
    }

    public static List<CharacterMovie> toCharacterList(List<CharacterMovieEntity> characterMovieEntityList){
        List<CharacterMovie> characterMovieList = new ArrayList<>();
        for (CharacterMovieEntity characterMovieEntity : characterMovieEntityList){
            characterMovieList.add(toCharacterMovie(characterMovieEntity));
        }
    return characterMovieList;
    }
}
