package com.fpmislata.Practica1b.controller;

import com.fpmislata.Practica1b.common.BookIoCContainer;
import com.fpmislata.Practica1b.domain.entity.Book;
import com.fpmislata.Practica1b.domain.service.AuthorService;
import com.fpmislata.Practica1b.domain.service.BookService;
import com.fpmislata.Practica1b.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.Practica1b.domain.service.impl.BooksServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/books")
@Controller
public class BookController {
    private BookService service;
    private AuthorService author;

    public BookController() {
        this.service = BookIoCContainer.getBookService();
    }

    public BookController(AuthorService author) {
        this.author = author;
    }

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("books", this.service.getAll());
        return "books";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable int id){
        model.addAttribute("book", this.service.findById(id));
        return "bookDetail";
    }

    @GetMapping("/addBook")
    public String getInsertForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "addBook";
    }

    @GetMapping("/author")
    public String all(Model model){
        model.addAttribute("author",this.author.all());
        return "authorList";
    }




    @PostMapping("/addBook")
    public String saveBook(@ModelAttribute Book book, Model model){
        model.addAttribute("books", book);
        service.addBook(book);
        return "saveBook";
    }


}
