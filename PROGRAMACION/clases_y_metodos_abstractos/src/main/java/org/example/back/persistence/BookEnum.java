package org.example.back.persistence;

public enum BookEnum {

    libro1(123,"El Principito","Antonie"),
    libro2(456, "Don Quijote", "Miguel de Cervantes"),
    libro3(789,"El Proceso","Franz");

    private int id;
    private String title;
    private String author;

    private BookEnum(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
