package com.fpmislata.Practica1b.persistence;
import com.fpmislata.Practica1b.domain.entity.Book;
import java.util.List;

public interface BookRepository {
    public List<Book> all();
   public Book findById(int id);
   public Book addBook(Book book);
}
