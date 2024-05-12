package com.fpmislata.estudiando.persistence.dao.impl;

import com.fpmislata.estudiando.domain.entity.Actor;
import com.fpmislata.estudiando.persistence.dao.bd.rawSql;
import com.fpmislata.estudiando.persistence.dao.ActorDao;
import com.fpmislata.estudiando.persistence.dao.mapper.ActorMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ActorDaoImpl implements ActorDao {

    /*private List<Actor> actorList = List.of(
            new Actor(1, "Marlon Brando"),
            new Actor(2, "Al Pacino"),
            new Actor(3, "James Caan"),
            new Actor(4, "Tim Robbins"),
            new Actor(5, "Morgan Freeman"),
            new Actor(6, "Bob Gunton"),
            new Actor(7, "Liam Neeson"),
            new Actor(8, "Ben Kingsley"),
            new Actor(9, "Ralph Fiennes"),
            new Actor(10, "Humphrey Bogart"),
            new Actor(11, "Ingrid Bergman"),
            new Actor(12, "Paul Henreid"),
            new Actor(13, "Robert De niro"),
            new Actor(14, "Christian Bale"),
            new Actor(15, "Heath Ledger"),
            new Actor(16, "Gary Oldman"),
            new Actor(17, "Sean Connery"),
            new Actor(18, "Christian Slater"),
            new Actor(19, "F. Murray Abraham"),
            new Actor(20, "Brad Pitt"),
            new Actor(21, "Edward Norton"),
            new Actor(22, "Helena Bonham Carter"),
            new Actor(23, "Harrison Ford"),
            new Actor(24, "Karen Allen"),
            new Actor(25, "John Rhys-Davies"),
            new Actor(26, "Alison Doody")
    );*/


    @Override
    public Actor findByCharacterId(Integer characterId) throws SQLException {
        try {
            List<Object> characterId1 = List.of(characterId);
            String sql  =" SELECT a.* FROM actor a INNER JOIN characterMovie cm ON cm.actorId = a.id and cm.id = ? ";
            ResultSet resultSet = rawSql.select(sql, characterId1);
            resultSet.next();
            return ActorMapper.toActor(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
