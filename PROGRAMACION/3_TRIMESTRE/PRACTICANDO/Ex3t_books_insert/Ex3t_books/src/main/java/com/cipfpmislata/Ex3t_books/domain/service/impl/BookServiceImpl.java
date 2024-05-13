package com.cipfpmislata.Ex3t_books.domain.service.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.domain.service.BooksService;
import com.cipfpmislata.Ex3t_books.persistence.repository.BookRepository;
import com.cipfpmislata.Ex3t_books.common.exceptions.ServiceException;

import java.util.List;

public class BookServiceImpl implements BooksService {
    BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Books findById(Integer id){
        Books books =bookRepository.findById(id);
        if(books==null){
            throw new ServiceException("No existe el libro");
        } else if (books.getAuthor()==null) {
            throw new ServiceException("Este libro no tiene autor");
        } else if (books.getEditorial()==null) {
            throw new ServiceException("Este libro no tiene editorial");
        }
        return books;
    }

    @Override
    public List<Books> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Books> findAllByName(String name) {
        List<Books> booksList = bookRepository.findAllByTitle(name);
        if (booksList.isEmpty()){
            throw new ServiceException("No hay libros que coincidan con este titulo");
        }
        return booksList;
    }

    @Override
    public List<Books> findAllByYear(Integer year) {
        List<Books> booksList = bookRepository.findAllByYear(year);
        if (booksList.isEmpty()){
            throw new ServiceException("No hay libros escritos en este año");
        }
        return booksList;
    }

    @Override
    public void insert(Books books) {
        bookRepository.insert(books);
    }

    @Override
    public void update(Books books) {
        bookRepository.update(books);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.delete(id);
    }
}
