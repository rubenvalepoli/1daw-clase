package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.repository.DirectorRepository;
import com.fpmislata.estudiando.persistence.repository.mapper.DirectorMapper;

import java.util.ArrayList;
import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {
    private DirectorDao directorDao;


    public DirectorRepositoryImpl (){

    }

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    @Override
    public List<Director> getAll() {
        List<DirectorEntity> directorEntitiesList = directorDao.getAll();
        List<Director> directorList = new ArrayList<>();
        for (DirectorEntity directorEntity : directorEntitiesList){
            Director director = DirectorMapper.toDirector(directorEntity);
            directorList.add(director);
        }
        return directorList;
    }

    @Override
    public Director findByDirectorId(Integer id) {
        DirectorEntity directorEntity = directorDao.findByDirectorId(id);
        Director director = DirectorMapper.toDirector(directorEntity);
        return director;
    }
}
