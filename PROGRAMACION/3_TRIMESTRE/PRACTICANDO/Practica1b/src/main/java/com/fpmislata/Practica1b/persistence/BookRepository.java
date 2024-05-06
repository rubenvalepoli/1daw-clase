package com.fpmislata.Practica1b.persistence;
import com.fpmislata.Practica1b.domain.entity.Book;
import com.fpmislata.Practica1b.exceptions.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;

public interface BookRepository {
    public List<Book> all();
   public Book findById(int id) throws ResourceNotFoundException;
   public Book addBook(Book book);
}
