package org.example.front;

import org.example.back.business.entity.Book;
import org.example.back.controller.BookController;

import java.util.List;


public class App {
    private static BookController controller = new BookController();

    public static void main(String[] args) {

        List<Book> books = App.controller.getAll();

        System.out.println(books);


    }
}
