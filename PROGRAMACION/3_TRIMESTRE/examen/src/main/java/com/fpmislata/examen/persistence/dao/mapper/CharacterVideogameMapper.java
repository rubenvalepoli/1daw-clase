package com.fpmislata.examen.persistence.dao.mapper;

import com.fpmislata.examen.domain.entity.CharacterVideogame;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterVideogameMapper {


    public static CharacterVideogame toCharacterVideogame (ResultSet resultSet){
        if (resultSet == null){
            return null;
        }
        try{
            return new CharacterVideogame(
                    resultSet.getString("c.name")
            );
        } catch (SQLException e){
            throw new RuntimeException("Error al mapear el CharacterVideogame",e);
        }
    }

    public static List<CharacterVideogame> toCharacterVideogameList(ResultSet resultSet){
        List<CharacterVideogame> characterVideogameList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
            characterVideogameList.add(toCharacterVideogame(resultSet));
        }
        return characterVideogameList;
    }

}
