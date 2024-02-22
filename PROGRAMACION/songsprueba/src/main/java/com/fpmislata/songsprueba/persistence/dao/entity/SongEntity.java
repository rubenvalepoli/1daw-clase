package com.fpmislata.songsprueba.persistence.dao.entity;

public class SongEntity {

    private Integer id;
    private String title;
    private Integer year;

    private Integer artistId;

    public SongEntity(Integer id, String title, Integer year, Integer artistId) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.artistId = artistId;
    }

    public SongEntity() {
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


    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @Override
    public String toString() {
        return "SongEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", artistId=" + artistId +
                '}';
    }
}
