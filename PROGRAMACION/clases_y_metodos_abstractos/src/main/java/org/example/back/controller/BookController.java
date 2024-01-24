package org.example.back.controller;

import org.example.back.business.entity.Book;
import org.example.back.business.service.BooksService;
import org.example.back.business.service.impl.BoksServiceImpl;

import java.util.List;

public class BookController {

    private BooksService service = new BoksServiceImpl();

    public List<Book> getAll(){
        return this.service.getAll();
    }

}
