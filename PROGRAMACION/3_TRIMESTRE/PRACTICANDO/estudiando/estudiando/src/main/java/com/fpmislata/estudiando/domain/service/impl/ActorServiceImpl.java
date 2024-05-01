package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.service.ActorService;
import com.fpmislata.estudiando.persistence.repository.ActorRepository;
import com.fpmislata.estudiando.persistence.repository.mapper.ActorMapper;

public class ActorServiceImpl implements ActorService {

    ActorRepository actorRepository;


    public ActorServiceImpl(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

}
