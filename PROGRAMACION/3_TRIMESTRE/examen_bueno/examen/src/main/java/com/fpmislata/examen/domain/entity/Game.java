package com.fpmislata.examen.domain.entity;

import java.util.List;

public class Game {

    private int id;
    private String game_code;
    private String title;
    private int release_year;
    private String description;
    private Director director;
    private List<CharacterVideogame> characterVideogameList;

    public Game(int id, String game_code, String title, int release_year, String description) {
        this.id = id;
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
    }

    public Game(int id, String game_code, String title, int release_year, String description, Director director) {
        this.id = id;
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
        this.director = director;
    }

    public Game(int id, String game_code, String title, int release_year, String description, Director director, List<CharacterVideogame> characterVideogameList) {
        this.id = id;
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
        this.director = director;
        this.characterVideogameList = characterVideogameList;
    }

    public Game(String game_code, String title, int release_year, String description, Director director) {
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGame_code() {
        return game_code;
    }

    public void setGame_code(String game_code) {
        this.game_code = game_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
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
                ", game_code='" + game_code + '\'' +
                ", title='" + title + '\'' +
                ", release_year=" + release_year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", characterVideogameList=" + characterVideogameList +
                '}';
    }
}
