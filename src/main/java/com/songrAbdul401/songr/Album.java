package com.songrAbdul401.songr;

public class Album {
    private String title;
    private String artist;
    private int numSongs;
    private double length;
    private String imgUrl;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Album(String title, String artist, int numSongs, double length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.numSongs = numSongs;
        this.length = length;
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

    public double getLength() {
        return length;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
