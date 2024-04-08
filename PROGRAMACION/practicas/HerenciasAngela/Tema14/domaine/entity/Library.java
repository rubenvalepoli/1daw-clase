package Ejercicios.Tema14.domaine.entity;

public class Library {
    private int id;
    private String name;
    private int idAuthor;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Library(int id, String name, int idAuthor) {
        this.id = id;
        this.name = name;
        this.idAuthor = idAuthor;
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

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }
}
