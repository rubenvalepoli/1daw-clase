package com.fpmislata.ex_3t_coches.common.ioc;

import com.fpmislata.ex_3t_coches.domain.service.ClienteService;
import com.fpmislata.ex_3t_coches.persistence.Dao.ClienteDao;
import com.fpmislata.ex_3t_coches.persistence.repository.ClienteRepository;

public class ClienteIOC {
    private static ClienteService clienteService;
    private static ClienteRepository clienteRepository;
    private static ClienteDao clienteDao;

    public static ClienteService getClienteService() {
        return clienteService;
    }

    public static void setClienteService(ClienteService clienteService) {
        ClienteIOC.clienteService = clienteService;
    }

    public static ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public static void setClienteRepository(ClienteRepository clienteRepository) {
        ClienteIOC.clienteRepository = clienteRepository;
    }

    public static ClienteDao getClienteDao() {
        return clienteDao;
    }

    public static void setClienteDao(ClienteDao clienteDao) {
        ClienteIOC.clienteDao = clienteDao;
    }
}
