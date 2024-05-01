package com.fpmislata.estudiando.domain.entity;

import java.util.List;

public class Movie {


    private int id;

    private String name;

    private int year;

    private Director director;

    private List<CharacterMovie> characterMovieList;

    public Movie(int id, String name, int year, Director director, List<CharacterMovie> characterMovieList) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.characterMovieList = characterMovieList;
    }

    public Movie(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Movie() {
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

    public void setCharacterMovieList(List<CharacterMovie> characterMovieList) {
    }

    public List<CharacterMovie> getCharacterMovieList() {
        return characterMovieList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", director=" + director +
                ", characterMovieList=" + characterMovieList +
                '}';
    }
}
