package com.fpmislata.examen.common.ioc;

import com.fpmislata.examen.domain.service.DirectorService;
import com.fpmislata.examen.domain.service.impl.DirectorServiceImpl;
import com.fpmislata.examen.persistence.dao.DirectorDao;
import com.fpmislata.examen.persistence.dao.impl.DirectorDaobdImpl;
import com.fpmislata.examen.persistence.repositoy.DirectorRepository;
import com.fpmislata.examen.persistence.repositoy.impl.DirectorRepositoryImpl;

public class DirectorIoC {



    private static DirectorDao directorDao;
    private static DirectorRepository directorRepository;
    private static DirectorService directorService;

    public static DirectorDao getDirectorDao(){
        if (directorDao==null){
            directorDao= new DirectorDaobdImpl();
        }
        return directorDao;
    }

    public static DirectorRepository getDirectorRepository(){
        if (directorRepository == null) {
            directorRepository= new DirectorRepositoryImpl(getDirectorDao());
        }
        return directorRepository;
    }

    public static DirectorService getDirectorService (){
        if (directorService==null){
            directorService= new DirectorServiceImpl(getDirectorRepository());
        }
        return directorService;
    }
}
