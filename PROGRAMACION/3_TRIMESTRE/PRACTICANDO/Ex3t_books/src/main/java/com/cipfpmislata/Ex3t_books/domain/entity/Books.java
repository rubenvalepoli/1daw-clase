package com.cipfpmislata.Ex3t_books.domain.entity;

public class Books {
    int id;
    String name;
    int year;
Characters characters;
Editorial editorial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Books(int id) {
        this.id = id;
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

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Books(int id, String name, int year, Characters characters, Editorial editorial) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.characters = characters;
        this.editorial = editorial;
    }

    public Books() {
    }
}
