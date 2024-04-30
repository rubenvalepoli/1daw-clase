package com.fpmislata.estudiando.persistence.dao;

import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;

public interface ActorDao {
    public ActorEntity findById(Integer id);
}
