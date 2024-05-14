package com.fpmislata.examen.common.ioc;

import com.fpmislata.examen.domain.service.GameService;
import com.fpmislata.examen.domain.service.impl.GameServiceImpl;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.dao.impl.GameDaobdImpl;
import com.fpmislata.examen.persistence.repository.GameRepository;
import com.fpmislata.examen.persistence.repository.impl.GameRepositoryImpl;

public class GamesIOC {

    private static GameDao gameDao;
    private static GameRepository gameRepository;
    private static GameService gameService;

    public static GameDao getGameDao(){
        if (gameDao==null){
            gameDao= new GameDaobdImpl();
        }
        return gameDao;
    }

    public static GameRepository getGamesRepository(){
        if (gameRepository == null) {
            gameRepository = new GameRepositoryImpl(getGameDao());
        }
        return gameRepository;
    }

    public static GameService getGameService(){
        if (gameService==null){
            gameService= new GameServiceImpl(getGamesRepository());
        }
        return gameService;
    }

}
