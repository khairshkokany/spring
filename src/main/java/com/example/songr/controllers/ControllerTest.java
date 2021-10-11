package com.example.songr.controllers;

import com.example.songr.Repo.AlbumRepo;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ControllerTest {

    @Autowired
    private AlbumRepo albumRepo;

    @GetMapping("/hello")
    public String helloWorld(){

        return "hello";
    }
    @GetMapping("/capitalize/{names}")
    public String capitalizeUpperCase(@PathVariable String names , Model model){
        model.addAttribute("names",names.toUpperCase());
        return "capHello";
    }

    Album album[] = {
            new Album("Happier Than Ever", "Bille Elish",56.5,6,"https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png"),
            new Album("Fearless (Taylor's Version)", "Taylor Swift",101.5,7,"https://upload.wikimedia.org/wikipedia/en/8/86/Taylor_Swift_-_Fearless.png"),
            new Album("hamaki ", "kol yom mn da ..!",75.6,11,"data:image/jpeg;base64,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")
    };

    @GetMapping("/albums")
    public String getAlbumInfo(Model model){
        model.addAttribute("albums", album);
        return "albums";
    }

@GetMapping("/v2/albums")

    public String getAlbumsAllData(Model model) {
        model.addAttribute("albuMs", albumRepo.findAll());
        return "albums";
}

//@PostMapping("/v2/albums")
//
//    public RedirectView createNewAlbum(@ModelAttribute Album album) {
//        albumRepo.save(album);
//        return new RedirectView("albums");
//}


    @PostMapping("/v2/albums")
    public RedirectView addNewAlbum(@RequestParam (value = "title") String title ,
                                    @RequestParam (value = "artist") String artist,

                                    @RequestParam (value = "length") double length,
                                    @RequestParam (value = "songCount") int songCount,
                                    @RequestParam (value = "imageUrl") String imageUrl)
                                 {

        Album albums = new Album(title,artist,length,songCount,imageUrl);
        albumRepo.save(albums);
        return new RedirectView("/v2/albums");

    }



}
