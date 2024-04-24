package com.fpmislata.estudiando.domain.entity;

public class Movie {

    private int id;

    private String name;

    private Director director;

    public Movie(int id, String name, Director director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }

    public Movie(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director=" + director +
                '}';
    }
}
