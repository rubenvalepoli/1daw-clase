package com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.impl;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.entity.Cliente;
import com.fpmislata.ex_3t_coches.persistence.Dao.ClienteDao;
import com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.db.Rawsql;
import com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.mapper.ClienteMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaodbImpl implements ClienteDao {
    @Override
    public Cliente findById(Integer clienteId) {
        try {
            String sql = "select * from cliente where id=?";
            List<Object> params = new ArrayList<>();
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return ClienteMapper.toCliente(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Cliente> findAll() {
        String sql = "select * from cliente";
        ResultSet resultSet = Rawsql.select(sql, null);
        return ClienteMapper.toClientList(resultSet);

    }

    @Override
    public void delete(Integer clienteId) {

        String sql = "delete from cliente where id=?";
        List<Object> params = List.of(clienteId);
        Rawsql.delete(sql, params);

    }

    @Override
    public void insert(Cliente cliente) {
        String sql = " INSERT INTO cliente VALUES(?,?,?,?)";
        List<Object> params = List.of(cliente.getClientid(),cliente.getNombre(),
                cliente.getApellido(),cliente.getCiudad());
        Rawsql.insert(sql,params);
    }
}
