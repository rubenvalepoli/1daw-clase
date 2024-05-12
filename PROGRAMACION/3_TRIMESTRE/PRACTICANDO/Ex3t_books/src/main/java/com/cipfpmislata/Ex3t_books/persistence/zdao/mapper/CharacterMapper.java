package com.cipfpmislata.Ex3t_books.persistence.zdao.mapper;

import com.cipfpmislata.Ex3t_books.domain.entity.Characters;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMapper {
    public static Characters toCharacters(ResultSet resultSet) {
        if (resultSet == null) {
            return null;
        }
        try {
            //nombres de las columnas en la bbdd
            return new Characters(resultSet.getInt("id"),resultSet.getString("name"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Characters> toCharactersList(ResultSet resultSet) {
        try {
            List<Characters> charactersList = new ArrayList<>();
            while (resultSet.next()) {
                charactersList.add(toCharacters(resultSet));
            }
            return charactersList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
