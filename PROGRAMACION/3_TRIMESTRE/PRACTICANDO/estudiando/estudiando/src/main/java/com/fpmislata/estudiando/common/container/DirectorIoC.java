package com.fpmislata.estudiando.common.container;

import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.impl.DirectorDaoImpl;

public class DirectorIoC {

    private static DirectorDao directorDao;

    public static DirectorDao getDirectorDao(){
        if (directorDao == null){
            directorDao = new DirectorDaoImpl();
        }
        return directorDao;
    }
}
