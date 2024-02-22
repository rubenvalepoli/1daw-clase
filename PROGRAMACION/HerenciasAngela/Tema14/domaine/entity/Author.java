package Ejercicios.Tema14.domaine.entity;

public class Author extends Library{

    public Author(Integer id, String name) {
        super(id,name);
    }
    @Override
    public String toString() {
        return  "id= " + this.getId() +
                ", name= " + this.getName();
    }
}
