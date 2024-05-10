package com.fpmislata.ex_3t_coches.domain.service.impl;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.entity.Cliente;
import com.fpmislata.ex_3t_coches.domain.service.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    ClienteService clienteService;

    public ClienteServiceImpl(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @Override
    public Cliente findById(Integer clienteId) {
        return clienteService.findById(clienteId);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @Override
    public void delete(Integer clienteId) {
        clienteService.delete(clienteId);
    }

    @Override
    public void insert(Cliente cliente) {
        clienteService.insert(cliente);
    }
}
