package com.fpmislata.estudiando.persistence.dao.mapper;


import com.fpmislata.estudiando.domain.entity.Director;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorMapper {

    public static Director toDirector(ResultSet resultSet){
        try {
            return new Director(
                    resultSet.getInt("id"),
                    resultSet.getString("name"));
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static List<Director> toDirectorList(ResultSet resultSet){

        List<Director> directorList = new ArrayList<>();
        while (true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
            directorList.add(toDirector(resultSet));
        }
        return directorList;


    }


}
