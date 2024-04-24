package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.Director;
import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.persistence.dao.entity.DirectorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.MovieEntity;

public class DirectorMapper {
    public static Director toDirector(DirectorEntity directorEntity){
        if (directorEntity == null){
            return null;
        }
        return new Director(
                directorEntity.getId(),
                directorEntity.getName()
        );
    }
}
