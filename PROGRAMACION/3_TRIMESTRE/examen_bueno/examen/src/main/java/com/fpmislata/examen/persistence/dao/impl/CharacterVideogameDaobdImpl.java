package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.persistence.dao.CharacterVideogameDao;
import com.fpmislata.examen.persistence.dao.bd.rawSql;
import com.fpmislata.examen.persistence.dao.mapper.CharacterVideogameMapper;

import java.sql.ResultSet;
import java.util.List;

public class CharacterVideogameDaobdImpl implements CharacterVideogameDao {
    @Override
    public List<CharacterVideogame> findCharacterVideogameByVideogameId (int id){
        List<Object> listCharacterId = List.of(id);
        ResultSet resultSet = rawSql.select("select c.name " +
                "from characters c " +
                "Inner Join games_characters gc on (c.id = gc.character_id) " +
                "where gc.game_id=?;", listCharacterId);
        List<CharacterVideogame> characterVideogameList = CharacterVideogameMapper.toCharacterVideogameList(resultSet);
        try {
            return characterVideogameList;
        }catch (Exception e){
            throw new RuntimeException("Error buscando un personaje por el id de un libro", e);
        }
    }
}
