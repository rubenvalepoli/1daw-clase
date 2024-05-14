package com.fpmislata.examen.persistence.dao.mapper;

import com.fpmislata.examen.domain.entity.Director;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectorMapper {

    public static Director toDirector(ResultSet resultSet) {

        if (resultSet == null) {
            return null;
        }

        try {
            return new Director(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("biography")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
