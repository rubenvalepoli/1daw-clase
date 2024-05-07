package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ActorEntityMapper {

    public static ActorEntity toActorEntity(ResultSet resultSet){
        try {
            return new ActorEntity(resultSet.getInt("id"), resultSet.getString("name"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
