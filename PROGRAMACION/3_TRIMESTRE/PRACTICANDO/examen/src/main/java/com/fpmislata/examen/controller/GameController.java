package com.fpmislata.examen.controller;


import com.fpmislata.examen.common.ioc.GamesIOC;
import com.fpmislata.examen.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
