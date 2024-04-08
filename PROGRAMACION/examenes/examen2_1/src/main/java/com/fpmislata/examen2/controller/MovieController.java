package com.fpmislata.examen2.controller;

import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/movies")
@Controller
public class MovieController {

    MovieService movieService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
    }



    @GetMapping
    public String getAll(Model model){
        model.addAttribute("movieList", this.movieService.getAll());
        return "movieList";
    }
}
