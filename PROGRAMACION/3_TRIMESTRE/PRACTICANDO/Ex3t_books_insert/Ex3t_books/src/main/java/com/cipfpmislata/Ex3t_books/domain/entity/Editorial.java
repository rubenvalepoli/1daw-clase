package com.cipfpmislata.Ex3t_books.domain.entity;

public class Editorial {
    int id;
    String name;

    public Editorial() {
    }

    public Editorial(int id, String name) {
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

    public Editorial(int id) {
        this.id = id;
    }
}
