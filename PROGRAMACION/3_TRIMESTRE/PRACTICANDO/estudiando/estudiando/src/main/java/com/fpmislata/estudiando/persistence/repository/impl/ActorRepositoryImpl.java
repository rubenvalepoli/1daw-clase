package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.persistence.dao.ActorDao;
import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;

public class ActorRepositoryImpl {

    public ActorRepositoryImpl(ActorDao actorDao){
        this.actorDao = actorDao;
    }

    ActorDao actorDao;
}
