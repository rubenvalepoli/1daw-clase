package com.fpmislata.practica1b.dto;

public class BookDto {

    private String title;
    private String author;


    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
