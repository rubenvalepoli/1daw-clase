package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.CharacterMovieService;
import com.fpmislata.books.domain.service.EditorialService;
import com.fpmislata.books.persistence.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    BookRepository bookRepository;
    EditorialService editorialService;
    private CharacterMovieService characterMovieService;


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
    public void deleteBook(int id){
        bookRepository.deleteBook(id);
    }

    @Override
    public void update(Integer id, String name, Integer year){
    //public void update(Integer id, String name, Integer year, String editorialName,List<String> charactersList){

        Book book = findBookById(id);
        /*Editorial editorial = editorialService.*/

       /* List<CharacterMovie> characterList = new ArrayList<>();
        for (String characterName : charactersList) {
            characterList.add(characterMovieService.findByName(characterName));
        }*/

        book.setName(name);
        book.setYear(year);
       /* book.setEditorial(e);
        book.setCharacterMovieList(characterList);*/


    }




}
