package com.fpmislata.examen.common.ioc;

import com.fpmislata.examen.domain.service.CharacterVideogameService;
import com.fpmislata.examen.domain.service.GameService;
import com.fpmislata.examen.domain.service.impl.CharacterVideogameServiceImpl;
import com.fpmislata.examen.domain.service.impl.GameServiceImpl;
import com.fpmislata.examen.persistence.dao.CharacterVideogameDao;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.dao.impl.CharacterVideogameDaobdImpl;
import com.fpmislata.examen.persistence.dao.impl.GameDaobdImpl;
import com.fpmislata.examen.persistence.repository.CharacterVideogameRepository;
import com.fpmislata.examen.persistence.repository.GameRepository;
import com.fpmislata.examen.persistence.repository.impl.CharacterVideogameRepositoryImpl;
import com.fpmislata.examen.persistence.repository.impl.GameRepositoryImpl;

public class CharacterVideogameIOC {

    private static CharacterVideogameDao characterVideogameDao;
    private static CharacterVideogameRepository characterVideogameRepository;
    private static CharacterVideogameService characterVideogameService;

    public static CharacterVideogameDao getCharacterVideogameDao(){
        if (characterVideogameDao==null){
            characterVideogameDao= new CharacterVideogameDaobdImpl();
        }
        return characterVideogameDao;
    }

    public static CharacterVideogameRepository getCharacterVideogameRepository(){
        if (characterVideogameRepository == null) {
            characterVideogameRepository = new CharacterVideogameRepositoryImpl(getCharacterVideogameDao());
        }
        return characterVideogameRepository;
    }

    public static CharacterVideogameService getCharacterVideogameService(){
        if (characterVideogameService==null){
            characterVideogameService= new CharacterVideogameServiceImpl(getCharacterVideogameRepository());
        }
        return characterVideogameService;
    }
}
