package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.domain.entity.Actor;

import java.sql.SQLException;
import java.util.List;

public interface ActorDao {


    public Actor findByCharacterId(Integer characterId) throws SQLException;
}
