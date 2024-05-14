package com.fpmislata.books.domain.entity;

import java.util.List;

public class Book {

    private int id;
    private String name;
    private int year;
    private List<CharacterMovie> characterMovieList;
    private Editorial editorial;


    public Book(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Book(int id, String name, int year, List<CharacterMovie> characterMovieList, Editorial editorial) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.characterMovieList = characterMovieList;
        this.editorial = editorial;
    }

    public Book(int id, String name, int year, Editorial editorial) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.editorial = editorial;
    }

    public Book(String name, int year, List<CharacterMovie> characterMovieList, Editorial editorial) {
        this.name = name;
        this.year = year;
        this.characterMovieList = characterMovieList;
        this.editorial = editorial;
    }

    public Book(int id) {
        this.id = id;
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

    public List<CharacterMovie> getCharacterMovieList() {
        return characterMovieList;
    }

    public void setCharacterMovieList(List<CharacterMovie> characterMovieList) {
        this.characterMovieList = characterMovieList;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", characterMovieList=" + characterMovieList +
                ", editorial=" + editorial +
                '}';
    }
}
