package com.fpmislata.ex_3t_coches.common.ioc;

import com.fpmislata.ex_3t_coches.domain.service.ConcesionarioService;
import com.fpmislata.ex_3t_coches.persistence.Dao.ConcesionarioDao;
import com.fpmislata.ex_3t_coches.persistence.repository.ConcesionarioRepository;

public class ConcesionarioIOC {
    private static ConcesionarioService concesionarioService;
    private static ConcesionarioRepository concesionarioRepository;
    private static ConcesionarioDao concesionarioDao;

    public static ConcesionarioService getConcesionarioService() {
        return concesionarioService;
    }

    public static void setConcesionarioService(ConcesionarioService concesionarioService) {
        ConcesionarioIOC.concesionarioService = concesionarioService;
    }

    public static ConcesionarioRepository getConcesionarioRepository() {
        return concesionarioRepository;
    }

    public static void setConcesionarioRepository(ConcesionarioRepository concesionarioRepository) {
        ConcesionarioIOC.concesionarioRepository = concesionarioRepository;
    }

    public static ConcesionarioDao getConcesionarioDao() {
        return concesionarioDao;
    }

    public static void setConcesionarioDao(ConcesionarioDao concesionarioDao) {
        ConcesionarioIOC.concesionarioDao = concesionarioDao;
    }
}
