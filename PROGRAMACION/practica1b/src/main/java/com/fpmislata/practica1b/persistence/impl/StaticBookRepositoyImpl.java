package com.fpmislata.practica1b.persistence.impl;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.impl.BooksServiceImpl;
import com.fpmislata.practica1b.persistence.BookRepository;

import java.util.List;

public class StaticBookRepositoyImpl implements BookRepository {
    List<Book> bookList = List.of(
            new Book(1, "El nombre de la rosa", "Umberto Eco"),
            new Book(2, "La insoportable levedad del ser", "Milan Kundera"),
            new Book(3, "1Q84", "Haruki Murakami")
    );

    @Override
    public List<Book> all(){
        return this.bookList;
    }
}
