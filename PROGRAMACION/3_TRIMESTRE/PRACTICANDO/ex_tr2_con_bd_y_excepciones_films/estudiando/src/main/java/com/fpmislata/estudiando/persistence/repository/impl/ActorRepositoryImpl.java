package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.persistence.dao.ActorDao;
import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;
import com.fpmislata.estudiando.persistence.repository.ActorRepository;

public class ActorRepositoryImpl implements ActorRepository {

    public ActorRepositoryImpl(ActorDao actorDao){
        this.actorDao = actorDao;
    }

    ActorDao actorDao;
}
