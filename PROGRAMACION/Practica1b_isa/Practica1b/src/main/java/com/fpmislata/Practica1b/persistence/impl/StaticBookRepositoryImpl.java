package com.fpmislata.Practica1b.persistence.impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fpmislata.Practica1b.domain.entity.Book;
import com.fpmislata.Practica1b.persistence.BookRepository;

public class StaticBookRepositoryImpl implements BookRepository {

    List<Book> books = new ArrayList<>();
    public StaticBookRepositoryImpl() {
        books.add(new Book(1, "El nombre de la rosa", "Umberto Eco"));
        books.add(new Book(2, "El conde de Montecristo", "Alejandro Dumas"));
        books.add(new Book(3, "La canción de Aquiles", "Madeline Miller"));
        books.add(new Book(4, "Tirant lo Blanc", "Joanot Martorell"));
        books.add(new Book(5, "El queso y los gusanos", "Carlo Ginzburg"));
        books.add(new Book(6, "Los reyes taumaturgos", "Marc Bloch"));
    }
    @Override
    public List<Book> all() {
        return this.books;
    }

    @Override
    public Book findById(int id) {
        for (Book book : books) {
            if (id == book.getId()) {
                return book;
            }
        }
        return null;
    }

    public Book addBook(Book book){
        books.add(book);
        return book;
    }
}
