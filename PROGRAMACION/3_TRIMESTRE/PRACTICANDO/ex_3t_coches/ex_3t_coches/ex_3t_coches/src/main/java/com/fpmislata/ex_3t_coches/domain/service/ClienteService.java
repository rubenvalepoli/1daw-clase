package com.fpmislata.ex_3t_coches.domain.service;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.entity.Cliente;

import java.util.List;

public interface ClienteService {
    public Cliente findById(Integer clienteId);
    public List<Cliente> findAll();
    public void delete(Integer clienteId);
    public void insert(Cliente cliente);
}
