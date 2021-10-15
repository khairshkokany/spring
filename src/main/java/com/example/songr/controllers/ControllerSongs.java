package com.example.songr.controllers;


import com.example.songr.Repo.AlbumRepo;
import com.example.songr.Repo.SongsRepo;
import com.example.songr.model.Album;
import com.example.songr.model.Song;
import com.example.songr.model.SongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ControllerSongs {

@Autowired
private SongsRepo songsRepo;

    private final AlbumRepo albumRepo;

    public ControllerSongs(AlbumRepo albumRepo) {
        this.albumRepo = albumRepo;
    }

    @GetMapping("/songs")
    public String findAllSongs(Model model) {
    model.addAttribute("songs" , songsRepo.findAll());
    return "songs";
    }

@PostMapping("/songs")
    public String createSong( SongDTO songDTO) {
    Album album = albumRepo.findByTitle(songDTO.getAlbum());
    Song song = new Song(songDTO.getTitle(),songDTO.getLength(),album);
    songsRepo.save(song);
return ("redirect:songs");
        }

        @GetMapping("/songs/{album_id}")
    public String songByAlbum(@PathVariable Long album_id,Model model){
        model.addAttribute("songs",songsRepo.findByAlbumId(album_id));
        return ("songs");
        }
    }





