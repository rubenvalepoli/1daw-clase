package com.fpmislata.examen.domain.entity;

public class Director {

    private int id;
    private String name;
    private String biography;


    public Director(int id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }

    public Director(int directorId) {
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

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                '}';
    }
}
