package com.fpmislata.examen2.persistence.dao.entity;

public class CharacterMovieEntity {

    private int id;
    private int movieId;
    private int actorId;
    private String characterName;

    public CharacterMovieEntity(int id, int movieId, int actorId, String characterName) {
        this.id = id;
        this.movieId = movieId;
        this.actorId = actorId;
        this.characterName = characterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
