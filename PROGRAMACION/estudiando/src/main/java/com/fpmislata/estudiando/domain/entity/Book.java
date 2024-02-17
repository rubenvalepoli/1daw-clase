package com.fpmislata.estudiando.domain.entity;

public class Book {



    private Integer id;
    private String title;


    public Book(Integer id, String title, Author cervantes) {
        this.id = id;
        this.title = title;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
