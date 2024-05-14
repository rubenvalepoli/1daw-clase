package com.fpmislata.examen.domain.entity;

public class CharacterVideogame {
    private int id;
    private String name;
    private String role;
    private String description;


    public CharacterVideogame(int id, String name, String role, String description) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.description = description;
    }

    public CharacterVideogame(String string) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CharacterGame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
