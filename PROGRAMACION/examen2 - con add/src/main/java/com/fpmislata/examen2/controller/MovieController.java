package com.fpmislata.examen2.controller;

import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.DirectorService;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String findById(Model model, @PathVariable Integer id){
        model.addAttribute("movie", this.movieService.findById(id));
        return "movieDetail";
    }

/*  Funciona pero voy a provar el new
    @GetMapping("/add")
    public String newMovie(Model model){
        DirectorService directorService = DirectorIoC.getDirectorService();
        model.addAttribute("directorList", directorService.getAll());
        model.addAttribute("movie", new Movie());
        return "movieAddForm";
    }*/


    /* Voy a provar si va si no descomentar el de arriba y eliminar este */

    @GetMapping("/new")
    public String newMovie(Model model){
        DirectorService directorService = DirectorIoC.getDirectorService();
        model.addAttribute("directorList", directorService.getAll());
        Director director = new Director();
        Movie movie = new Movie();
        movie.setDirector(director);
        model.addAttribute("movie",movie);
        return "movieAddForm";
    }

    @PostMapping
    public String save(@ModelAttribute Movie movie, Model model/* @RequestParam Integer directorId*/){
        model.addAttribute("movie", movie);
        Director director = new Director();
        director.setId(directorId);
        movie.setDirector(director);
        movieService.insert(movie);
        return "redirect:/movies";
    }

    /*@DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        movieService.delete(id);
        return "redirect:/movies";
    }*/
}



