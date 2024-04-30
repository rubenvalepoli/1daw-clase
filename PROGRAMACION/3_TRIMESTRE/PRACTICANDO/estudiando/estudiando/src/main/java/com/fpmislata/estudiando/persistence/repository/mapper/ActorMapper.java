package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.Actor;
import com.fpmislata.estudiando.persistence.dao.entity.ActorEntity;

import java.util.ArrayList;
import java.util.List;

public class ActorMapper {

    public static Actor toActor(ActorEntity actorEntity){
        if (actorEntity == null){
            return null;
        }
        return new Actor(
                actorEntity.getId(),
                actorEntity.getName()
        );
    }

    public static List<Actor> toActorList(List<ActorEntity> actorEntityList){
        List<Actor> actorList = new ArrayList<>();
        for (ActorEntity actorEntity : actorEntityList){
            actorList.add(toActor(actorEntity));
        }
        return actorList;
    }

}
