package com.songrAbdul401.songr;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String SongTitle;
    private int songLength;
    private int trackNumber;

    @ManyToOne
    Album album;

    public Song() {

    }

    public Song(String songTitle, int songLength, int trackNumber, Album onAlbum) {
        SongTitle = songTitle;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
        album = onAlbum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSongTitle() {
        return SongTitle;
    }

    public void setSongTitle(String songTitle) {
        SongTitle = songTitle;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
