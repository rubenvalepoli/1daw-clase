package com.fpmislata.examen.domain.service.impl;

import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.domain.service.DirectorService;
import com.fpmislata.examen.persistence.repository.DirectorRepository;

public class DirectorServiceImpl implements DirectorService {

    DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public Director findDirectorById(int id){
        return this.directorRepository.findDirectorById(id);
    }
}
