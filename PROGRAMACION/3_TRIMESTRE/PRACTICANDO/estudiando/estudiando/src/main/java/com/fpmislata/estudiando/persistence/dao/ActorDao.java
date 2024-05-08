package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;

import java.sql.SQLException;
import java.util.List;

public interface ActorDao {

    public List<ActorEntity> findByMovieId(Integer movieId) throws SQLException;
    public ActorEntity findByCharacterId(Integer characterId) throws SQLException;
}
