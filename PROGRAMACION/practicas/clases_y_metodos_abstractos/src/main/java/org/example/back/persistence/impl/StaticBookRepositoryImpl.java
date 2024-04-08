package org.example.back.persistence.impl;

import org.example.back.business.entity.Book;
import org.example.back.persistence.BookEnum;
import org.example.back.persistence.BookRepository;

import java.util.List;

public class StaticBookRepositoryImpl implements BookRepository {

    List<Book> books = List.of(
            new Book(1, "El nombre de la rosa", "Umberto Eco"),
            new Book(2, "La insoportable levedad del ser", "Milan Kundera"),
            new Book(3, "1Q84", "Haruki Murakami")
    );



    @Override
    public List<Book> all() {
        return this.books;
    }
}

