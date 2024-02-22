package com.fpmislata.songsprueba.persistence.dao.entity;

public class ArtistEntity {


    private Integer id;

    private String name;

    public ArtistEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ArtistEntity() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
