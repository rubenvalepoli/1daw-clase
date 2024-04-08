package Music.songs.controller;

import Music.songs.common.ArtistIoCContainer;
import Music.songs.common.SongIoCContainer;
import Music.songs.domain.service.ArtistService;
import Music.songs.domain.service.impl.ArtistServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/artists")
@Controller
public class ArtistController {
    private ArtistService artistService;
    public ArtistController() {
        this.artistService = ArtistIoCContainer.getArtistService();
    }

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("artists", this.artistService.getAll());
        return "artists";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable Integer id){
        model.addAttribute("artist", this.artistService.findById(id));
        return "artistDetail";
    }
}
