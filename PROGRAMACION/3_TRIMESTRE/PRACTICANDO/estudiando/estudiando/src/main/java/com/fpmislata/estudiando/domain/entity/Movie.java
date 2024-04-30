package com.fpmislata.estudiando.domain.entity;

public class Movie {

    private int id;

    private String name;

    private int year;

    private Director director;

    public Movie(int id, String name, int year, Director director) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public Movie(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
                ", year=" + year +
                ", director=" + director +
                '}';
    }
}
