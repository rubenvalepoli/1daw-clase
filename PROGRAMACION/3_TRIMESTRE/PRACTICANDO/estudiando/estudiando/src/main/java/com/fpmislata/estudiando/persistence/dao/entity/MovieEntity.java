package com.fpmislata.estudiando.persistence.dao.entity;

import javax.swing.text.html.parser.Entity;

public class MovieEntity {

    private int id;

    private String name;

    private int id_director;

    public MovieEntity(int id, String name, int id_director) {
        this.id = id;
        this.name = name;
        this.id_director = id_director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id_director=" + id_director +
                '}';
    }
}
