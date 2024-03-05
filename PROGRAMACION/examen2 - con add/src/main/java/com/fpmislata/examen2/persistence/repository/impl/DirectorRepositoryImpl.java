package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.domain.entity.Actor;
import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.examen2.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examen2.persistence.repository.DirectorRepository;
import com.fpmislata.examen2.persistence.repository.mapper.ActorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.CharacterMovieMapper;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;
import org.yaml.snakeyaml.tokens.DirectiveToken;

import java.util.ArrayList;
import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {

    private DirectorDao directorDao;

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    @Override
    public List<Director> getAll() {
        List<DirectorEntity> directorEntityList = directorDao.getAll();
        List<Director> directorList = new ArrayList<>();
        for (DirectorEntity directorEntity : directorEntityList){
            Director director = DirectorMapper.toDirector(directorEntity);
            directorList.add(director);
        }
        return directorList;
    }

    @Override
    public Director findById(Integer id){
        DirectorEntity directorEntity = directorDao.findById(id);
        Director director = DirectorMapper.toDirector(directorEntity);
        return director;
    } //ARREGLAR ESTA MIERDA, HA DE SER DE DIRECTOR
}
