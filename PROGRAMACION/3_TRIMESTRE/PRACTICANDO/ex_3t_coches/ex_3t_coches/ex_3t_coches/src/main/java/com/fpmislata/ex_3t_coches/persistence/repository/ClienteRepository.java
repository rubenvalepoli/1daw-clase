package com.fpmislata.ex_3t_coches.persistence.repository;

import com.fpmislata.ex_3t_coches.domain.entity.Cliente;

import java.util.List;

public interface ClienteRepository {
    public Cliente findById(Integer clienteId);
    public List<Cliente> findAll();
    public void delete(Integer clienteId);
    public void insert(Cliente cliente);
}
