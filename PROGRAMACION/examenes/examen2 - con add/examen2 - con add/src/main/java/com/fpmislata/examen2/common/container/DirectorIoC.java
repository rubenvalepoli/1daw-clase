package com.fpmislata.examen2.common.container;


import com.fpmislata.examen2.domain.service.DirectorService;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.DirectorServiceImpl;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.examen2.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examen2.persistence.repository.DirectorRepository;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.impl.DirectorRepositoryImpl;
import com.fpmislata.examen2.persistence.repository.impl.MovieRepositoryImpl;

public class DirectorIoC {

    private static DirectorService directorService;
    private static DirectorRepository directorRepository;
    private static DirectorDao directorDao;

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

    public static DirectorService getDirectorService(){
        if (directorService == null){
            directorService = new DirectorServiceImpl(getDirectorRepository());
        }
        return directorService;
    }


}
