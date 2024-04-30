package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.persistence.dao.ActorDao;
import com.fpmislata.examen2.persistence.repository.ActorRepository;

public class ActorRepositoryImpl implements ActorRepository{

    public ActorRepositoryImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    ActorDao actorDao;



}
