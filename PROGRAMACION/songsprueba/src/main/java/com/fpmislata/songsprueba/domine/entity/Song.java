package com.fpmislata.songsprueba.domine.entity;

import org.springframework.stereotype.Controller;

public class Song {

    private Integer id;
    private String title;
    private Integer year;
    private Artist artist;


    public Song(Integer id, String title, Integer year, Artist artist) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public Song(Integer id, String title, Integer year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", artist=" + artist +
                '}';
    }
}
