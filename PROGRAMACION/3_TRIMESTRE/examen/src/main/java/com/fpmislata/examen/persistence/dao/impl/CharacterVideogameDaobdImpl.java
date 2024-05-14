package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.persistence.dao.CharacterVideogameDao;
import com.fpmislata.examen.persistence.dao.bd.Rawsql;
import com.fpmislata.examen.persistence.dao.mapper.CharacterVideogameMapper;

import java.sql.ResultSet;
import java.util.List;

public class CharacterVideogameDaobdImpl implements CharacterVideogameDao {

    @Override
    public List<com.fpmislata.examen.domain.entity.CharacterVideogame> findCharacterVideogameByVideogameId (int id){
        List<Object> listCharacterId = List.of(id);
        ResultSet resultSet = Rawsql.select("select c.name " +
                "from characters c " +
                "Inner Join games_characters gc on (c.id = gc.character_id) " +
                "where gc.game_id=?;", listCharacterId);
        List<com.fpmislata.examen.domain.entity.CharacterVideogame> characterVideogameList = CharacterVideogameMapper.toCharacterVideogameList(resultSet);
        try {
            return characterVideogameList;
        }catch (Exception e){
            throw new RuntimeException("Error buscando un personaje de in videojuego", e);
        }
    }
}
