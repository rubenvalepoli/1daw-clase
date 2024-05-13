package com.fpmislata.books.domain.entity;

public class Editorial {

    private int id;
    private String name;

    public Editorial(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Editorial(int editorialId) {
    }

    public Editorial() {
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

    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
