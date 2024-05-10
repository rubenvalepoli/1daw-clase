package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.domain.service.DirectorService;
import com.fpmislata.estudiando.persistence.repository.DirectorRepository;

import java.util.List;

public class DirectorServiceImpl implements DirectorService {


    private DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }


    @Override
    public List<Director> getAll() {
        return this.directorRepository.getAll();
    }
}
