package com.cipfpmislata.Ex3t_books.domain.entity;

public class Characters {
    int id;

    public Characters() {
    }

    public Characters(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;

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

    public Characters(int id) {
        this.id = id;
    }
}
