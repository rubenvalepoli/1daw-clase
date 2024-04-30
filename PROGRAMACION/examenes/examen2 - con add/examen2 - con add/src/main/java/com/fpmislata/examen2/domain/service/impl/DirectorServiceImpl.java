package com.fpmislata.examen2.domain.service.impl;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.DirectorService;
import com.fpmislata.examen2.persistence.repository.DirectorRepository;
import com.fpmislata.examen2.persistence.repository.impl.DirectorRepositoryImpl;

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
