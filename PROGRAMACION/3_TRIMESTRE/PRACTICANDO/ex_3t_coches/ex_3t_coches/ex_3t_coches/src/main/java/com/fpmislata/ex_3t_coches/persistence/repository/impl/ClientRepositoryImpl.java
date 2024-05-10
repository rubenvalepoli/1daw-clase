package com.fpmislata.ex_3t_coches.persistence.repository.impl;

import com.fpmislata.ex_3t_coches.domain.entity.Cliente;
import com.fpmislata.ex_3t_coches.persistence.Dao.CarDao;
import com.fpmislata.ex_3t_coches.persistence.Dao.ClienteDao;
import com.fpmislata.ex_3t_coches.persistence.repository.ClienteRepository;

import java.util.List;

public class ClientRepositoryImpl implements ClienteRepository {
    private ClienteDao clienteDao;

    public ClientRepositoryImpl(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Override
    public Cliente findById(Integer clienteId) {
        return clienteDao.findById(clienteId);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    public void delete(Integer clienteId) {
        clienteDao.delete(clienteId);
    }

    @Override
    public void insert(Cliente cliente) {
        clienteDao.insert(cliente);
    }
}
