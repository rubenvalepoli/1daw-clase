package com.fpmislata.ex_3t_coches.persistence.Dao;

import com.fpmislata.ex_3t_coches.domain.entity.Cliente;

import java.util.List;

public interface ClienteDao {
    public Cliente findById(Integer clienteId);
    public List<Cliente> findAll();
    public void delete(Integer clienteId);
    public void insert(Cliente cliente);

}
