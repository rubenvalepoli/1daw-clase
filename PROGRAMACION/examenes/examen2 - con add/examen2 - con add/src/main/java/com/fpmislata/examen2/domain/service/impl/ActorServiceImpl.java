package com.fpmislata.examen2.domain.service.impl;

import com.fpmislata.examen2.domain.service.ActorService;
import com.fpmislata.examen2.persistence.repository.ActorRepository;

public class ActorServiceImpl implements ActorService {

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    ActorRepository actorRepository;


}
