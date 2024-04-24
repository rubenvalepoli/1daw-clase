package com.fpmislata.estudiando.controller;

import com.fpmislata.estudiando.domain.service.MovieService;
import com.fpmislata.estudiando.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/movies")
@Controller
public class MovieController {

    private MovieService movieService = new MovieServiceImpl();

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("movieList",movieService.getAll());
        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable int id){
        model.addAttribute("movie",movieService.findById(id));
        return "movieDetail";
    }

}
