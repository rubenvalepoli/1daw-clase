package com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.mapper;

import com.fpmislata.ex_3t_coches.domain.entity.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteMapper {
    public static Cliente toCliente(ResultSet resultSet) {
        try {
            return new Cliente(
                    resultSet.getInt("id_cliente"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellido"),
                    resultSet.getString("ciudad"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Cliente> toClientList(ResultSet resultSet) {
        try {
            List<Cliente> clienteList = new ArrayList<>();
            while (resultSet.next()) {
                clienteList.add(toCliente(resultSet));
            }
            return clienteList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
