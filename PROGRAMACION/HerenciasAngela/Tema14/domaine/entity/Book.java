package Ejercicios.Tema14.domaine.entity;

public class Book extends Library{

    public Book(Integer id, String name, Integer idAuthor) {
        super(id, name, idAuthor);
    }
    @Override
    public String toString() {
        return "id= " + this.getId() +
                ", title= " + this.getName() +
                ", idAuthor= " + this.getIdAuthor();
    }
}
