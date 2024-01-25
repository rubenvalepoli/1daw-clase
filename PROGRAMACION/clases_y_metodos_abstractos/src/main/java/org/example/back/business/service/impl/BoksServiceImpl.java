package org.example.back.business.service.impl;

import org.example.back.business.entity.Book;
import org.example.back.business.service.BooksService;
import org.example.back.persistence.BookRepository;
import org.example.back.persistence.impl.EnumBookRepositoryImpl;
import org.example.back.persistence.impl.StaticBookRepositoryImpl;

import java.util.List;

public class BoksServiceImpl implements BooksService {

    private BookRepository repository = new EnumBookRepositoryImpl();

    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }
}
