package com.fpmislata.estudiando.persistence.dao.entity;

public class AuthorEntity {

    private Integer id;
    private String author;



    public AuthorEntity(Integer id, String author) {
        this.id = id;
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
