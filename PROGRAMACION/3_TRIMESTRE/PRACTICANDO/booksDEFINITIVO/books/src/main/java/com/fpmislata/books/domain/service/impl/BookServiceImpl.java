package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.common.ioc.CharacterMovieIOC;
import com.fpmislata.books.common.ioc.EditorialIOC;
import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.CharacterMovieService;
import com.fpmislata.books.domain.service.EditorialService;
import com.fpmislata.books.persistence.repository.BookRepository;
import com.fpmislata.books.persistence.repository.CharacterMovieRepository;
import com.fpmislata.books.persistence.repository.EditorialRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    BookRepository bookRepository;

    EditorialService editorialService = EditorialIOC.getEditorialService();
    CharacterMovieService characterMovieService = CharacterMovieIOC.getCharacterMovieService();


    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> findAll() {
            return bookRepository.findAll();
    }

    @Override
    public Book findBookById(int id){

        try {
            return bookRepository.findBookById(id);
        } catch (Exception e){
            throw new RuntimeException("El libro no existe");
        }

    }

    @Override
    public void deleteBook(int id){
        bookRepository.deleteBook(id);
    }

    @Override
    public void create (String title, String editorialName, List<String> characterNameMovieList, int year){
        Editorial editorial = editorialService.findEditorialByName(editorialName);

        List<CharacterMovie> characterMovieList = new ArrayList<>();
        for (String characterNameMovie : characterNameMovieList) {
            characterMovieList.add(characterMovieService.findCharacterMovieByName(characterNameMovie));
        }

        Book book = new Book(title, year, characterMovieList, editorial);

        bookRepository.create(book);
    }

}
