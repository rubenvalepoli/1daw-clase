package com.fpmislata.examen2.controller;

import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable int id){
        model.addAttribute("movie", this.movieService.findById(id));
        model.addAttribute("director", this.movieService.findIdDirector(id));
        return "movieDetail";
    }


}
