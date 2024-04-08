package com.fpmislata.estudiando.persistence.dao.entity;

import com.fpmislata.estudiando.domain.entity.Author;

public class BookEntity {

    private Integer id;

    private String title;

    //private Author author;


    public BookEntity(Integer id, String title) {
        this.id = id;
        this.title = title;
        //this.author = author;
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

   /* public Author getAuthor() {
        return author;
    }*/

 /*   public void setAuthor(Author author) {
        this.author = author;
    }*/
}
