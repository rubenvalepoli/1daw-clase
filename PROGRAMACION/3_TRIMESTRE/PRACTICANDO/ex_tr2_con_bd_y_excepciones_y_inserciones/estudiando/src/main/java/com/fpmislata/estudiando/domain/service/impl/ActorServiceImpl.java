package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.service.ActorService;
import com.fpmislata.estudiando.persistence.repository.ActorRepository;

public class ActorServiceImpl implements ActorService {

    ActorRepository actorRepository;


    public ActorServiceImpl(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

}
