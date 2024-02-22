package Ejercicios.Tema14.controller;

import Ejercicios.Tema14_1.Exception.DomaineException;
import Ejercicios.Tema14.domaine.entity.Author;
import Ejercicios.Tema14.domaine.entity.Book;
import Ejercicios.Tema14.domaine.entity.Library;
import Ejercicios.Tema14.domaine.service.Service;
import Ejercicios.Tema14.domaine.service.impl.AuthorServiceImpl;

import java.util.List;

public class AuthorController {
    private Service service = new AuthorServiceImpl();

    public List<Library> findAll(){
        return service.findAll();
    }

    public Author findById(Integer idAuthor){
        return (Author) service.findbyId(idAuthor);
    }

    public void insert(Book newBook, Integer author) throws DomaineException {
        service.insert(newBook, author);
    }

    public void delete(Integer idAuthor) throws DomaineException {
        service.delete(idAuthor);
    }

}
