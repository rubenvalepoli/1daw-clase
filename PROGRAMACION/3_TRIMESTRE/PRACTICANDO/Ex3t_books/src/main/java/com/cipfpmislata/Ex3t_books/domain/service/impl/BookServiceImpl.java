package com.cipfpmislata.Ex3t_books.domain.service.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.domain.service.BooksService;
import com.cipfpmislata.Ex3t_books.persistence.repository.BookRepository;

import java.util.List;

public class BookServiceImpl implements BooksService {
    BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Books findById(Integer id) {
        Books books =bookRepository.findById(id);
        if(books==null){
            throw new RuntimeException("No existe el libro");
        }
        return bookRepository.findById(id);
    }

    @Override
    public List<Books> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Books> findAllByName(String name) {
        return bookRepository.findAllByName(name);
    }

    @Override
    public List<Books> findAllByCharacterName(String name) {
        return bookRepository.findAllByName(name);
    }

    @Override
    public List<Books> findAllByYear(Integer year) {
        return bookRepository.findAllByYear(year);
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
