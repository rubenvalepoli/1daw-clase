package com.cipfpmislata.Ex3t_books.persistence.repository.impl;

import com.cipfpmislata.Ex3t_books.common.container.AuthorIOC;
import com.cipfpmislata.Ex3t_books.common.container.CharacterIOC;
import com.cipfpmislata.Ex3t_books.common.container.EditorialIOC;
import com.cipfpmislata.Ex3t_books.domain.entity.Author;
import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.domain.entity.Characters;
import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;
import com.cipfpmislata.Ex3t_books.persistence.dao.AuthorDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.BooksDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.CharactersDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.EditorialDao;
import com.cipfpmislata.Ex3t_books.persistence.repository.BookRepository;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.CharactersDaoJdbc;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    BooksDao booksDao;
    AuthorDao authorDao;
    EditorialDao editorialDao;
    CharactersDao charactersDao;

    public BookRepositoryImpl(BooksDao booksDao) {
        this.booksDao = booksDao;
        //Hay que inicializar los otros dao que se usan
        editorialDao = EditorialIOC.getEditorialDao();
        charactersDao = CharacterIOC.getCharactersDao();
        authorDao = AuthorIOC.getAuthorDao();
    }

    //Esto es una funcion privada, solo se usa en el repo y sirve para completar los atributos del libro sin repetir codigo
    private Books completarBook(Books books){
        //añadimos el listado de personajes de libro
        List<Characters> charactersList = charactersDao.findByBook(books.getId());
        books.setCharactersList(charactersList);

        //añadimos la editorial
        int editorialid = books.getEditorial().getId();
        Editorial editorial = editorialDao.findById(editorialid);
        books.setEditorial(editorial);

        //añadimos el autor
        int authorid = books.getAuthor().getId();
        Author author = authorDao.findById(authorid);
        books.setAuthor(author);
        return books;
    }

    @Override
    public Books findById(Integer id) {
        Books books = booksDao.findById(id);
        return completarBook(books);
    }

    @Override
    public List<Books> findAll() {
        //No es necesario completar todos los datos de los libros en este metodo
        List<Books> booksList = new ArrayList<>();
        for (Books books:booksDao.findAll()){
            booksList.add(completarBook(books));
        }
        return booksList;
    }

    @Override
    public List<Books> findAllByTitle(String title) {
        List<Books> booksList = new ArrayList<>();
        for (Books books:booksDao.findAllByTitle(title)){
            booksList.add(completarBook(books));
        }
        return booksList;
    }

    @Override
    public List<Books> findAllByYear(Integer year) {
        List<Books> booksList = new ArrayList<>();
        for (Books books:booksDao.findAllByYear(year)){
            booksList.add(completarBook(books));
        }
        return booksList;
    }

    @Override
    public void insert(Books books) {
        booksDao.insert(books);
    }

    @Override
    public void update(Books books) {
        booksDao.update(books);
    }

    @Override
    public void delete(Integer id) {
        booksDao.delete(id);
    }
}
