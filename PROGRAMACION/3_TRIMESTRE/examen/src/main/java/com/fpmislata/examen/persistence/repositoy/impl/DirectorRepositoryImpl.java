package com.fpmislata.examen.persistence.repositoy.impl;

import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.persistence.dao.DirectorDao;
import com.fpmislata.examen.persistence.repositoy.DirectorRepository;

public class DirectorRepositoryImpl implements DirectorRepository {

    DirectorDao directorDao;

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }


    @Override
    public Director findDirectorById(int id){
        return this.directorDao.findDirectorById(id);
    }
}
