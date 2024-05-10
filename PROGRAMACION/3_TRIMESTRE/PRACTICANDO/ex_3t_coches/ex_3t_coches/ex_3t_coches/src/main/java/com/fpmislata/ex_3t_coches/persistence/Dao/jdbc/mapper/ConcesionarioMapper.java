package com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.mapper;

import com.fpmislata.ex_3t_coches.domain.entity.Concesionario;
import com.fpmislata.ex_3t_coches.persistence.Dao.entity.ConcesionarioEntity;

public class ConcesionarioMapper {
    public static Concesionario toConcesionario(ConcesionarioEntity concesionarioEntity){
        return new Concesionario(
                concesionarioEntity.getConcesionarioid(),
                concesionarioEntity.getNombre(),
                concesionarioEntity.getCiudad());
    }
    public static ConcesionarioEntity ToConcesionarioEntity(Concesionario concesionario){
        return new ConcesionarioEntity(
                concesionario.getConcesionarioid(),
                concesionario.getNombre(),
                concesionario.getCiudad()
        );
    }

}
