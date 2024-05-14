package com.fpmislata.examen.domain.service.impl;

import com.fpmislata.examen.common.ioc.CharacterVideogameIoC;
import com.fpmislata.examen.common.ioc.DirectorIoC;
import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.domain.service.CharacterVideogameService;
import com.fpmislata.examen.domain.service.DirectorService;
import com.fpmislata.examen.domain.service.GameService;
import com.fpmislata.examen.persistence.repositoy.GameRepository;

import java.awt.print.Book;
import java.util.List;


public class GameServiceImpl implements GameService {

    GameRepository gameRepository;
    DirectorService directorService =  DirectorIoC.getDirectorService();

    CharacterVideogameService characterVideogameService = CharacterVideogameIoC.getCharacterVideogameService();

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findGameByCode(String game_code){
        Game game = gameRepository.findGameById(game_code);
        Director director = directorService.findDirectorById(game.getDirector().getId());
        List<CharacterVideogame> characterVideogameList = characterVideogameService.findCharacterVideogameByVideogameId(game.getId());
        game.setDirector(director);
        game.setCharacterVideogameList(characterVideogameList);
        return game;
    }
}
