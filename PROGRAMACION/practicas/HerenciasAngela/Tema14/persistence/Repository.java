package Ejercicios.Tema14.persistence;

import Ejercicios.Tema14.domaine.entity.Library;

import java.util.List;

public interface Repository {

    public List<Library> findAll();

    public Library findbyId(Integer idBook);

    public void insert(Library newLibrary, Integer idAuthor);

    public void delete(Integer idAuthor);

}
