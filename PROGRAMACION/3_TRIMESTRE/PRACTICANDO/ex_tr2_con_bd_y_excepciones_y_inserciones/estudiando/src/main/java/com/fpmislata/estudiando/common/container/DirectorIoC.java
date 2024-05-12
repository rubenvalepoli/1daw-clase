package com.fpmislata.estudiando.common.container;

import com.fpmislata.estudiando.domain.service.DirectorService;
import com.fpmislata.estudiando.domain.service.impl.DirectorServiceImpl;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.estudiando.persistence.repository.DirectorRepository;
import com.fpmislata.estudiando.persistence.repository.impl.DirectorRepositoryImpl;

public class DirectorIoC {

    private static DirectorDao directorDao;
    private static DirectorRepository directorRepository;

    private static DirectorService directorService;


    public static DirectorDao getDirectorDao(){
        if (directorDao == null){
            directorDao = new DirectorDaoImpl();
        }
        return directorDao;
    }
    public static DirectorRepository getDirectorRepository(){
        if (directorRepository == null){
            directorRepository = new DirectorRepositoryImpl(getDirectorDao());
        }
        return directorRepository;
    }

    public static DirectorService getDirectorService() {

        if (directorService == null){
            directorService = new DirectorServiceImpl(getDirectorRepository());
        }
        return directorService;
    }

}
