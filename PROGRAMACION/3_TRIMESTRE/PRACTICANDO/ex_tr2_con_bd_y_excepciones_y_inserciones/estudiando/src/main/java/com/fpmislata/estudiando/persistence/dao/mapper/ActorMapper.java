package com.fpmislata.estudiando.persistence.dao.mapper;


import com.fpmislata.estudiando.domain.entity.Actor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorMapper {

    public static Actor toActor(ResultSet resultSet) throws SQLException {
        if (resultSet == null) {
            return null;
        }
        return new Actor(
                resultSet.getInt("id"),
                resultSet.getString("name")
        );
    }

    public static List<Actor> toActorList(ResultSet resultSet) throws SQLException {
        List<Actor> actorList = new ArrayList<>();
        while (resultSet.next()) {
            actorList.add(toActor(resultSet));
        }
        return actorList;
    }
}
