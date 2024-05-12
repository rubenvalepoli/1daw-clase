package com.cipfpmislata.Ex3t_books.controller;

import com.cipfpmislata.Ex3t_books.common.container.BookIOC;
import com.cipfpmislata.Ex3t_books.domain.service.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {


    private final BooksService booksService;

    public BookController() {
        this.booksService = BookIOC.getBooksService();
    }


    @GetMapping("")
    public String findAll(Model model) {
        model.addAttribute("bookList", this.booksService.findAll());
        return "books";
    }

}
