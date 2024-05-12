package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.persistence.dao.DirectorDao;
import com.fpmislata.estudiando.persistence.dao.mapper.DirectorMapper;
import com.fpmislata.estudiando.persistence.repository.DirectorRepository;

import java.util.ArrayList;
import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {
    private DirectorDao directorDao;

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    @Override
    public List<Director> getAll() {
        return directorDao.getAll();
    }

    @Override
    public Director findByDirectorId(Integer id) {
        return directorDao.findByDirectorId(id);
    }
}
