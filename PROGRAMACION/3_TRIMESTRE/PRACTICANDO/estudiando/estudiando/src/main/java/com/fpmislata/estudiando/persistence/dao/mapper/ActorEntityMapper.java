package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorEntityMapper {

    public static ActorEntity toActorEntity(ResultSet resultSet) throws SQLException {
        if (resultSet == null) {
            return null;
        }
        return new ActorEntity(
                resultSet.getInt("id"),
                resultSet.getString("name")
        );
    }

    public static List<ActorEntity> toActorEntityList(ResultSet resultSet) throws SQLException {
        List<ActorEntity> actorEntityList = new ArrayList<>();
        while (resultSet.next()) {
            actorEntityList.add(toActorEntity(resultSet));
        }
        return actorEntityList;
    }
}
