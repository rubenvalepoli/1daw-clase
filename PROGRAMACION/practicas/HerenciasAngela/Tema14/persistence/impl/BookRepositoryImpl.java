package Ejercicios.Tema14.persistence.impl;

import Ejercicios.Tema14.domaine.entity.Book;
import Ejercicios.Tema14.domaine.entity.Library;
import Ejercicios.Tema14.persistence.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepositoryImpl implements Repository {
    List<Library> bookList = new ArrayList<>(Arrays.asList(
            new Book(1,"El nombre de la Rosa",1),
            new Book(2,"El señor de los anillos",2),
            new Book(3,"El hobbit",2),
            new Book(4,"La fundacion",3)));

    @Override
    public List<Library> findAll() {
        return bookList;
    }

    @Override
    public Library findbyId(Integer idBook) {
        for (Library book: bookList){
            if (book.getId()==idBook){
                return book;
            }
        }
        return null;
    }

    @Override
    public void insert(Library newBook, Integer idAuthor) {
        newBook.setId(bookList.toArray().length +1);
        newBook.setIdAuthor(idAuthor);
        bookList.add(newBook);
    }

    @Override
    public void delete(Integer idBook) {
        Library book = findbyId(idBook);
        bookList.remove(book);
    }
}