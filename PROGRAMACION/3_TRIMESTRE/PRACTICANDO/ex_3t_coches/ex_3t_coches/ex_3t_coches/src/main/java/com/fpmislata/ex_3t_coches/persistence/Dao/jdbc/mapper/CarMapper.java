package com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.mapper;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.entity.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper {
    public static Car toCar(ResultSet resultSet) {
        if( resultSet == null){
            return null;
        }
        try {
            return new Car(
                    resultSet.getInt("id"),
                    resultSet.getString("marca"),
                    resultSet.getString("modelo"),
                    resultSet.getString("matricula"),
                    new Cliente(resultSet.getInt("id_propietario"))
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
