package Music.songs.controller;

import Music.songs.common.SongIoCContainer;
import Music.songs.domain.service.SongService;
import Music.songs.domain.service.impl.SongServiceImpl;
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
    public String getAll(Model model){
        model.addAttribute("songs", this.songService.getAll());
        return "songs";
    }

    @GetMapping ("/{id}")
    public String findById(Model model, @PathVariable Integer id){
        model.addAttribute("song", this.songService.findById(id));
        return "songDetail";
    }
}
