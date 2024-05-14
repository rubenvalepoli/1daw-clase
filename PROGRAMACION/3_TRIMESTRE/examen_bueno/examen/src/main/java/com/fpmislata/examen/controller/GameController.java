package com.fpmislata.examen.controller;


import com.fpmislata.examen.common.ioc.GamesIOC;
import com.fpmislata.examen.domain.entity.CharacterVideogame;
import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.domain.entity.Game;
import com.fpmislata.examen.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {

    GameService gameService;

    public GameController() {
        this.gameService = GamesIOC.getGameService();
    }

    @GetMapping("")
    public String findAll(Model model) {
        model.addAttribute("gameList", this.gameService.findAll());
        return "gameList";
    }

    @GetMapping("/{game_code}")
    public String findByBookId(Model model, @PathVariable String game_code) {
        model.addAttribute("game", gameService.findGameById(game_code));
        return "gameDetail";
    }


    @PostMapping
    public String save(){
        Game game = new Game(
                "MI3-2022",
                "Return to Monkey Island",
                2022,
                "A new adventure of Guybrush Threepwood",
                new Director(1, null, null)
        );
        List<CharacterVideogame> characterVideogameList = List.of(
                new CharacterVideogame(1, null, null, null),
                new CharacterVideogame(2, null, null, null),
                new CharacterVideogame(3, null, null, null)
        );
        game.setCharacterVideogameList(characterVideogameList);
        gameService.insert(game);
        return "redirect:/games";
    }
}
