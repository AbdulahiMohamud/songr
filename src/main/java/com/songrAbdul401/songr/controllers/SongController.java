package com.songrAbdul401.songr.controllers;


import com.songrAbdul401.songr.Album;
import com.songrAbdul401.songr.Song;
import com.songrAbdul401.songr.repositories.AlbumRepo;
import com.songrAbdul401.songr.repositories.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepo songRepo;

    @Autowired
    AlbumRepo albumRepo;


    @PostMapping ("addsong")
    public RedirectView addSongToAlbum(String songTitle, int songLength, int trackNumber, String onAlbum){
        Album album = albumRepo.findByTitle(onAlbum);
        Song newSong = new Song(songTitle,songLength,trackNumber, album);
        songRepo.save(newSong);

        return new RedirectView("/album");
    }
}
