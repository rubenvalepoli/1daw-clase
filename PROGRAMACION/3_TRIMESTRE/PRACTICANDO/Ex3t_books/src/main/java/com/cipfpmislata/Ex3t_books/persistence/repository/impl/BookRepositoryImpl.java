package com.cipfpmislata.Ex3t_books.persistence.repository.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.domain.entity.Characters;
import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;
import com.cipfpmislata.Ex3t_books.persistence.zdao.AuthorDao;
import com.cipfpmislata.Ex3t_books.persistence.zdao.BooksDao;
import com.cipfpmislata.Ex3t_books.persistence.zdao.CharactersDao;
import com.cipfpmislata.Ex3t_books.persistence.zdao.EditorialDao;
import com.cipfpmislata.Ex3t_books.persistence.repository.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    BooksDao booksDao;
    AuthorDao authorDao;
    EditorialDao editorialDao;
    CharactersDao charactersDao;

    public BookRepositoryImpl(BooksDao booksDao) {
        this.booksDao = booksDao;
    }


    @Override
    public Books findById(Integer id) {
        // buscamos el libro
        Books books = booksDao.findById(id);

        //añadimos los personajes al libro

        int characterid = books.getCharacters().getId();
        Characters characters = charactersDao.findByCharacterMovieId(characterid);
        books.setCharacters(characters);

        //añadimos la editorial
        int editorialid = books.getEditorial().getId();
        Editorial editorial = editorialDao.findById(editorialid);
        books.setEditorial(editorial);

        return books;
    }

    @Override
    public List<Books> findAll() {
        return booksDao.findAll();
    }

    @Override
    public List<Books> findAllByName(String name) {
        return booksDao.findAllByName(name);
    }

    @Override
    public List<Books> findAllByCharacterName(String name) {
        return booksDao.findAllByName(name);
    }

    @Override
    public List<Books> findAllByYear(Integer year) {
        return booksDao.findAllByYear(year);
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
