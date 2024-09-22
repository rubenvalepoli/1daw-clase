package com.fpmislata.estudiando2.domine.entity;

public class Book {

    private Integer id;

    private Integer dobleid;

    private String title;

    private String author;


    public Book(Integer id, Integer dobleid, String title, String author) {
        this.id = id;
        this.dobleid = dobleid;
        this.title = title;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getDobleid() {
        return dobleid;
    }

    public void setDobleid(Integer dobleid) {
        this.dobleid = dobleid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", dobleid=" + dobleid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
