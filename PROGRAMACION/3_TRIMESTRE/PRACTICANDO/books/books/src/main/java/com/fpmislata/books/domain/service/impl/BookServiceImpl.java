package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.persistence.repository.BookRepository;

import java.util.List;

public class BookServiceImpl implements BookService {
    BookRepository bookRepository;


    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(int id){
        return bookRepository.findBookById(id);
    }

    @Override
    public void deleteCharacterBooks(int id){
        bookRepository.deleteCharacterBooks(id);
    }

    @Override
    public void deleteBook(int id){
        bookRepository.deleteBook(id);
    }

}
