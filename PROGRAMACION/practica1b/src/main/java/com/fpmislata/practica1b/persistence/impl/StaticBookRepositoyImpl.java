package com.fpmislata.practica1b.persistence.impl;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.impl.BooksServiceImpl;
import com.fpmislata.practica1b.persistence.BookRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBookRepositoyImpl implements BookRepository {
    List<Book> bookList = new ArrayList<>();
    public StaticBookRepositoyImpl() {
        bookList.add(new Book(1, "El nombre de la rosa", "Umberto Eco"));
        bookList.add(new Book(2, "La insoportable levedad del ser", "Milan Kundera"));
        bookList.add(new Book(3, "1Q84", "Haruki Murakami"));
    }


    @Override
    public List<Book> all(){
        return this.bookList;
    }

    @Override
    public Book findById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book create(String title, String author) {
        int newId = bookList.get(bookList.size() - 1).getId() + 1;
        Book book = new Book(newId, title, author);
        bookList.add(book);
        return book;
    }


}
