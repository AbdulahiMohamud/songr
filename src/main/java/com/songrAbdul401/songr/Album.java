package com.songrAbdul401.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String title;
    private String artist;
    private int numSongs;
    private int length;
    private String imgUrl;



    @OneToMany(mappedBy = "album")
    private List<Song> songsInAlbum;

    public Album() {

    }

    public Album(String title, String artist, int numSongs, int length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.numSongs = numSongs;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public int getLength() {
        return length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public List<Song> getSongsInAlbum() {
        return songsInAlbum;
    }

    public void setSongsInAlbum(List<Song> songsInAlbum) {
        this.songsInAlbum = songsInAlbum;
    }
}
