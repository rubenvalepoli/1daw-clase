package com.fpmislata.songsprueba.controller;

import com.fpmislata.songsprueba.common.ArtistIoCContainer;
import com.fpmislata.songsprueba.common.SongIoCContainer;
import com.fpmislata.songsprueba.domine.service.ArtistService;
import com.fpmislata.songsprueba.domine.service.impl.ArtistServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/artists")
@Controller
public class ArtistController {
    ArtistService artistService;

    public ArtistController() {
        this.artistService = ArtistIoCContainer.getArtistService();
    }


    @GetMapping
    public String getAll (Model model){
        model.addAttribute("artists", this.artistService.getAll());
        return "artist";
    }


    @GetMapping("/{id}")
    public String findById (Model model,@PathVariable Integer id){
        model.addAttribute("artist", this.artistService.findById(id));
        return "artistDetails";
    }


}
