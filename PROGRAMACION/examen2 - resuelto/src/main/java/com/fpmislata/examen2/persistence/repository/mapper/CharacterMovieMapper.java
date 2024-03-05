package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

import java.util.ArrayList;
import java.util.List;

public class CharacterMovieMapper {
    public static CharacterMovie toCharacterMovie(CharacterMovieEntity characterMovieEntity){
        if (characterMovieEntity == null){
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
