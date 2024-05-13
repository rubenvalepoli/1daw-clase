package com.fpmislata.books.domain.entity;

public class CharacterMovie {

    private int id;
    private String name;
    private Book book;

    public CharacterMovie(int id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public CharacterMovie(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "CharacterMovie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
