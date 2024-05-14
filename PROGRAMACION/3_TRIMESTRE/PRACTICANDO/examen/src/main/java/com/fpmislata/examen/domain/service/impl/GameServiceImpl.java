package com.fpmislata.examen.domain.service.impl;

import com.fpmislata.examen.common.ioc.CharacterVideogameIOC;
import com.fpmislata.examen.common.ioc.DirectorIOC;
import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.domain.service.CharacterVideogameService;
import com.fpmislata.examen.domain.service.DirectorService;
import com.fpmislata.examen.domain.service.GameService;
import com.fpmislata.examen.persistence.repository.GameRepository;

import java.util.List;

public class GameServiceImpl implements GameService {

    GameRepository gameRepository;
    DirectorService directorService =  DirectorIOC.getDirectorService();

    CharacterVideogameService characterVideogameService = CharacterVideogameIOC.getCharacterVideogameService();

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> findAll(){
        return this.gameRepository.findAll();
    }

    @Override
    public Game findGameById(String game_code){
        Game game = gameRepository.findGameById(game_code);
        Director director = directorService.findDirectorById(game.getDirector().getId());
        List<CharacterVideogame> characterVideogameList = characterVideogameService.findCharacterVideogameByVideogameId(game.getId());
        game.setDirector(director);
        game.setCharacterVideogameList(characterVideogameList);
        return game;
    }
}
