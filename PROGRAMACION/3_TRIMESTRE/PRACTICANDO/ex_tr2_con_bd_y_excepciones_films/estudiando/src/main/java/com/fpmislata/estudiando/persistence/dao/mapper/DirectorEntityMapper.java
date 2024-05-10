package com.fpmislata.estudiando.persistence.dao.mapper;

import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorEntityMapper {

    public static DirectorEntity toDirectorEntity(ResultSet resultSet){
        try {
            return new DirectorEntity(
                    resultSet.getInt("id"),
                    resultSet.getString("name"));
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static List<DirectorEntity> toDirectorEntityList(ResultSet resultSet){

        List<DirectorEntity> directorEntityList = new ArrayList<>();
        while (true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
            directorEntityList.add(toDirectorEntity(resultSet));
        }
        return directorEntityList;


    }


}
