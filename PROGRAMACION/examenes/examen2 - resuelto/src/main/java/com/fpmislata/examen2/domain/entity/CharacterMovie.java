package com.fpmislata.examen2.domain.entity;

public class CharacterMovie {
    private int id;
    private String characterName;
    private Movie movie;
    private Actor actor;

    public CharacterMovie(int id, String characterName, Movie movie, Actor actor) {
        this.id = id;
        this.characterName = characterName;
        this.movie = movie;
        this.actor = actor;
    }

    public CharacterMovie(int id, String characterName) {
        this.id = id;
        this.characterName = characterName;
    }

    public CharacterMovie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "CharacterMovie{" +
                "id=" + id +
                ", characterName='" + characterName + '\'' +
                ", movie=" + movie +
                ", actor=" + actor +
                '}';
    }

}
