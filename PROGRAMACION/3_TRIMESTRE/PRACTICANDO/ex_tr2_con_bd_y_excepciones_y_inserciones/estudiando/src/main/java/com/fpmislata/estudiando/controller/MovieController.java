package com.fpmislata.estudiando.controller;

import com.fpmislata.estudiando.common.container.MovieIoC;
import com.fpmislata.estudiando.domain.entity.Movie;
import com.fpmislata.estudiando.domain.service.MovieService;
import com.fpmislata.estudiando.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RequestMapping("/movies")
@Controller
public class MovieController {

    private MovieService movieService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
    }

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("movieList",movieService.getAll());
        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable int id) throws SQLException {
        model.addAttribute("movie",movieService.findById(id));
        return "movieDetail";
    }

    @PostMapping("/{id}")
    public String delete (@PathVariable int id){
        movieService.deleteCharacterMovie(id);
        movieService.deleteMovie(id);
        return "redirect:/movies";
    }





}
