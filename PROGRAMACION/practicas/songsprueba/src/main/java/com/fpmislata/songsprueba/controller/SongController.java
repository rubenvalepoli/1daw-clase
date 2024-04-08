package com.fpmislata.songsprueba.controller;

import com.fpmislata.songsprueba.common.SongIoCContainer;
import com.fpmislata.songsprueba.domine.entity.Song;
import com.fpmislata.songsprueba.domine.service.SongService;
import com.fpmislata.songsprueba.domine.service.impl.SongServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/songs")
@Controller
public class SongController {

    private SongService songService;

    public SongController() {
        this.songService = SongIoCContainer.getSongService();
    }

    @GetMapping
    public String getAll (Model model){
        model.addAttribute("songs", this.songService.getAll());
        return "songs";
    }

    @GetMapping("{id}")
    public String findById (Model model,@PathVariable Integer id){
        model.addAttribute("song", this.songService.findById(id));
        return "songDetails";
    }



}
