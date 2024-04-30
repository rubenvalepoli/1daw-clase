package com.fpmislata.examen2.common.container;


import com.fpmislata.examen2.domain.service.ActorService;
import com.fpmislata.examen2.domain.service.impl.ActorServiceImpl;
import com.fpmislata.examen2.persistence.dao.ActorDao;
import com.fpmislata.examen2.persistence.dao.impl.ActorDaoImpl;
import com.fpmislata.examen2.persistence.repository.ActorRepository;
import com.fpmislata.examen2.persistence.repository.impl.ActorRepositoryImpl;



public class ActorIoC {

    private static ActorService actorService;
    private static ActorRepository actorRepository;
    private static ActorDao actorDao;

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

}
