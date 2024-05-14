package com.fpmislata.examen.common.ioc;

import com.fpmislata.examen.domain.service.GameService;
import com.fpmislata.examen.domain.service.impl.GameServiceImpl;
import com.fpmislata.examen.persistence.dao.GameDao;
import com.fpmislata.examen.persistence.dao.impl.GameDaobdImpl;
import com.fpmislata.examen.persistence.repositoy.GameRepository;
import com.fpmislata.examen.persistence.repositoy.impl.GameRepositoryImpl;

public class GameIoC {

    private static GameService gameService;
    private static GameDao gameDao;
    private static GameRepository gameRepository;


    public static GameService getGameService(){
        if (gameService==null){
            gameService= new GameServiceImpl(getGameRepository());
        }
        return gameService;
    }


    public static GameDao getGameDao(){
        if (gameDao==null){
            gameDao= new GameDaobdImpl();
        }
        return gameDao;
    }



    public static GameRepository getGameRepository(){
        if (gameRepository == null) {
            gameRepository= new GameRepositoryImpl(getGameDao());
        }
        return gameRepository;

    }


}
