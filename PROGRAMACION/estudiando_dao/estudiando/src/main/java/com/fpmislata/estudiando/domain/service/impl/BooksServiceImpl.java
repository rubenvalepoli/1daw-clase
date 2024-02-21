package com.fpmislata.estudiando.domain.service.impl;

import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.domain.service.BooksService;
import com.fpmislata.estudiando.persistence.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksServiceImpl implements BooksService{
      private BookRepository repository;

    public BooksServiceImpl(BookRepository repository) {
        this.repository = repository;
    }




    @Override
    public List<Book> findall() {
        return this.repository.findall();
    }

    @Override
    public Book findById(int id) {
        return this.repository.findById(id);
    }

/*    @Override
    public void insert(Book book, Integer authorID){
        Author author = repository.findById(authorID);
        repository.insert(book);
    }*/

    @Override
    public Book addBook(Book book) {
        return this.repository.addBook(book);
    }
}
