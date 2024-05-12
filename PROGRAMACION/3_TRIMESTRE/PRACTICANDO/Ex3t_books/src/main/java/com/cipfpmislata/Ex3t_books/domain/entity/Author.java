package com.cipfpmislata.Ex3t_books.domain.entity;

import java.util.List;

public class Author {
    int id;
    String name;
    private List<Books> booksList;

    public Author(int id) {
        this.id = id;
    }

    public Author() {
    }

    public Author(int id, String name) {
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
}
