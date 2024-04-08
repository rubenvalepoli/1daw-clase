package org.example.back.persistence.impl;

import org.example.back.business.entity.Book;
import org.example.back.persistence.BookEnum;
import org.example.back.persistence.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class EnumBookRepositoryImpl implements BookRepository {

    private static List<Book> bookList = List.of(
            new Book(BookEnum.libro1.getId(), BookEnum.libro1.getTitle(), BookEnum.libro1.getAuthor()),
            new Book(BookEnum.libro2.getId(), BookEnum.libro2.getTitle(), BookEnum.libro2.getAuthor()),
            new Book(BookEnum.libro3.getId(), BookEnum.libro3.getTitle(), BookEnum.libro3.getAuthor())
    );

    public List<Book> all() {
        return bookList;
    }
}
