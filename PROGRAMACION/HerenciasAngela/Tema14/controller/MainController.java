package Ejercicios.Tema14.controller;

import Ejercicios.Tema14_1.Exception.DomaineException;
import Ejercicios.Tema14.domaine.entity.Library;
import Ejercicios.Tema14.domaine.service.Service;
import Ejercicios.Tema14.domaine.service.impl.AuthorServiceImpl;
import Ejercicios.Tema14.domaine.service.impl.BookServiceImpl;

import java.util.List;

//Crear aqui las excepciones con los errores entre atributo y clase
public class MainController {
    private Service bookService = new BookServiceImpl();
    private Service authorService = new AuthorServiceImpl();


    public List<Library> findAllBook() throws DomaineException {
        return bookService.findAll();
    }
    public Library findbyIdBook(Integer idBook){
        return bookService.findbyId(idBook);
    }
    public void addBook(Library newBook, Integer author) throws DomaineException {
        bookService.insert(newBook, author);
    }
    public void deleteBook(Integer idBook) throws DomaineException {
        bookService.delete(idBook);
    }


    public List<Library> findAllAuthor(){
        return authorService.findAll();
    }
    public Library findbyIdAuthor(Integer idAuthor){
        return authorService.findbyId(idAuthor);
    }
    public void addAuthor(Library newAuthor, Integer idAuthor) throws DomaineException {
        authorService.insert(newAuthor, idAuthor);
    }
    public void deleteAuthor(Integer idAuthor) throws DomaineException {
        authorService.delete(idAuthor);
    }


    /*public List<Book> findBookByAuthor(Integer idAuthor) throws DomaineException {
        return service.findBookByAuthor(idAuthor);
    }*/
}
