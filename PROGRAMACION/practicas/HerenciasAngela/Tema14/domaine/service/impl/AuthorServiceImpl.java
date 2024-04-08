package Ejercicios.Tema14.domaine.service.impl;

import Ejercicios.Tema14_1.Exception.DomaineException;
import Ejercicios.Tema14.domaine.entity.Library;
import Ejercicios.Tema14.domaine.service.Service;
import Ejercicios.Tema14.persistence.Repository;
import Ejercicios.Tema14.persistence.impl.AuthorRepositoryImpl;

import java.util.List;

public class AuthorServiceImpl implements Service{

    private Repository repository = new AuthorRepositoryImpl();
    private Service bookService = new BookServiceImpl();

    @Override
    public List<Library> findAll() {
        return repository.findAll();
    }

    //Detecta si el autor no existe
    @Override
    public Library findbyId(Integer idAuthor) throws DomaineException {
        Library author = repository.findbyId(idAuthor);
        if (author!=null){
            return author;
        }
        throw new DomaineException("El autor no existe");
    }

    //Detecta si el autor no existe o si aun tiene libros asociados
    @Override
    public void insert(Library newBook, Integer author){
        repository.insert(newBook, author);
    }

    @Override
    public void delete(Integer idAuthor) throws DomaineException {
        List<Library> authorBooks = bookService.findAll();
        for (Library book : authorBooks){
            if (book.getIdAuthor()==idAuthor){
                throw new DomaineException("El autor aun tiene libros asocidados");
            }
        }
        repository.delete(idAuthor);
    }


}
