package com.fpmislata.estudiando.common.container;

import com.fpmislata.estudiando.domain.service.ActorService;
import com.fpmislata.estudiando.domain.service.impl.ActorServiceImpl;
import com.fpmislata.estudiando.persistence.dao.ActorDao;
import com.fpmislata.estudiando.persistence.dao.impl.ActorDaoImpl;
import com.fpmislata.estudiando.persistence.repository.ActorRepository;
import com.fpmislata.estudiando.persistence.repository.MovieRepository;
import com.fpmislata.estudiando.persistence.repository.impl.ActorRepositoryImpl;

public class ActorIoC {
/*

    private static ActorDao actorDao;

    private static ActorService actorService;

    private static ActorRepository actorRepository;


    public static ActorDao getActorDao(){
        if (actorDao == null){
            actorDao = new ActorDaoImpl();
        }
        return actorDao;
    }

    public static ActorRepository getActorRepository(){
        if (actorRepository == null){
            actorRepository = new ActorRepositoryImpl(getActorDao());
        }
        return actorRepository;
    }

    public static ActorService getActorService(){
        if (actorService == null){
            actorService = new ActorServiceImpl(getActorRepository());
        }
        return actorService;
    }
*/

}
