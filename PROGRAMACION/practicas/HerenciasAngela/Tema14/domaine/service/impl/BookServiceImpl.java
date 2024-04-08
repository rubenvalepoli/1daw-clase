package Ejercicios.Tema14.domaine.service.impl;

import Ejercicios.Tema14_1.Exception.DomaineException;
import Ejercicios.Tema14.domaine.entity.Book;
import Ejercicios.Tema14.domaine.entity.Library;
import Ejercicios.Tema14.domaine.service.Service;
import Ejercicios.Tema14.persistence.Repository;
import Ejercicios.Tema14.persistence.impl.BookRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

//Crear aqui las excepciones con las condiciones de uso
public class BookServiceImpl implements Service {
    private Repository repository = new BookRepositoryImpl();
    private Service authorService = new AuthorServiceImpl();

    //Detecta si hay algun libro con un autor que no existe
    @Override
    public List<Library> findAll() throws DomaineException {
        List<Library> bookList = repository.findAll();
        for (Library book:bookList){
            authorService.findbyId(book.getIdAuthor());
        }
        return bookList;
    }

    //Detecta si el libro no existe
    @Override
    public Library findbyId(Integer idBook) throws DomaineException {
        Library book = repository.findbyId(idBook);
        if (book!=null) {
            return book;
        }
        throw new DomaineException("El libro no existe");
    }

    //Detecta si el autor no existe
    @Override
    public void insert(Library newBook, Integer author) throws DomaineException {
        authorService.findbyId(author);
        repository.insert(newBook, author);
    }

    @Override
    public void delete(Integer idBook){
        repository.delete(idBook);
    }

    //Detecta si el autor no existe
    public List<Book> findBookByAuthor(Integer idAuthor) throws DomaineException {

        List<Library> bookList = repository.findAll();
        List<Book> authorBooks= new ArrayList<>();
        for (Library book: bookList){
            if (book.getIdAuthor()==idAuthor){
                authorBooks.add((Book) book);
            }
        }
        return authorBooks;
    }
}
