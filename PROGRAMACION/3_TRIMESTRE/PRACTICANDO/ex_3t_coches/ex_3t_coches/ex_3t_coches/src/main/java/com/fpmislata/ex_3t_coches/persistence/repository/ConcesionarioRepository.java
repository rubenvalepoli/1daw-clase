package com.fpmislata.ex_3t_coches.persistence.repository;

import com.fpmislata.ex_3t_coches.domain.entity.Concesionario;


import java.util.List;

public interface ConcesionarioRepository {
    public Concesionario findById(Integer concesionarioId);
    public List<Concesionario> findAll();
    public void delete(Integer concesionarioId);
    public void insert(Concesionario concesionario);
}
