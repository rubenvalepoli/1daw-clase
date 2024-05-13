package com.cipfpmislata.Ex3t_books.domain.entity;

import java.util.List;

public class Books {
    int id;
    String title;
    int year;
    //Characters characters; los personajes es un listado
    List<Characters> charactersList;
    Editorial editorial;
    Author author;
    public Books() {
    }
    public Books(int id) {
        this.id = id;
    }
    public Books(int id, String title, int year, Editorial editorial,Author author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.editorial = editorial;
        this.author = author;
    }
    public Books(int id, String title, int year, List<Characters> charactersList, Editorial editorial,Author author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.charactersList = charactersList;
        this.editorial = editorial;
        this.author = author;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Characters> getCharactersList() {
        return charactersList;
    }
    public void setCharactersList(List<Characters> charactersList) {
        this.charactersList = charactersList;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
}
