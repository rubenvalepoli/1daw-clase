package com.fpmislata.examen.persistence.repositoy;

import com.fpmislata.examen.domain.entity.Director;

public interface DirectorRepository {
    public Director findDirectorById(int id);
}
