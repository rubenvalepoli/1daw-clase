package com.fpmislata.estudiando.persistence.dao.entity;

public class BookEntity {

    Integer id;

    String title;


    public BookEntity(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public BookEntity() {
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
