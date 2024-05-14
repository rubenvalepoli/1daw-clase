package com.fpmislata.examen.domain.entity;

import java.util.List;

public class Game {
    private int id;
    private String gameCode;
    private String title;
    private int releaseYear;
    private String description;
    private Director director;
    private List<CharacterVideogame> characterVideogameList;

    public Game(int id, String gameCode, String title, int releaseYear, String description) {
        this.id = id;
        this.gameCode = gameCode;
        this.title = title;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public Game(int id, String gameCode, String title, int releaseYear, String description, Director director, List<CharacterVideogame> characterVideogameList) {
        this.id = id;
        this.gameCode = gameCode;
        this.title = title;
        this.releaseYear = releaseYear;
        this.description = description;
        this.director = director;
        this.characterVideogameList = characterVideogameList;
    }

    public Game(int id, String gameCode, String title, int releaseYear, String description, Director director) {
        this.id = id;
        this.gameCode = gameCode;
        this.title = title;
        this.releaseYear = releaseYear;
        this.description = description;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<CharacterVideogame> getCharacterVideogameList() {
        return characterVideogameList;
    }

    public void setCharacterVideogameList(List<CharacterVideogame> characterVideogameList) {
        this.characterVideogameList = characterVideogameList;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameCode='" + gameCode + '\'' +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", characterVideogameList=" + characterVideogameList +
                '}';
    }
}
