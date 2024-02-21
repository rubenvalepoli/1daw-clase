package com.fpmislata.estudiando.domain.entity;

public class Author {

    private Integer id;
    private String author;



    public Author(Integer id, String author) {
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
