package com.fpmislata.examen.controller;

import com.fpmislata.examen.common.ioc.GamesIOC;
import com.fpmislata.examen.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directors")
public class DirectorController {

    GameService gameService;


    public DirectorController() {
        this.gameService = GamesIOC.getGameService();
    }

    @GetMapping("/{id}/games")
    public String findByBookId(Model model, @PathVariable int id) {
        model.addAttribute("gameList", gameService.findByDirectorId(id));
        return "directorDetail";
    }
}
