package com.fpmislata.practica1b.controller;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.impl.BooksServiceImpl;
import com.fpmislata.practica1b.dto.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/libros")
@Controller
public class BookController {

    private BooksServiceImpl service = new BooksServiceImpl();


    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("books", this.service.getAll());
        return "bookList";
    }

    @GetMapping("/{id}")
    public String getOne(Model model, @PathVariable int id) {
        Book book = service.findById(id);
        if (book == null) {
            return "error";
        }
        model.addAttribute("book", book);
        return "bookDetail";
    }

    @GetMapping("/crear")
    public String create() {
        return "bookCreate";
    }

    @PostMapping
    public String create(Model model, BookDto bookDto) {
        Book book = this.service.create(bookDto.getTitle(), bookDto.getAuthor());
        model.addAttribute("book", book);
        return "bookCreateResult";
    }
}
