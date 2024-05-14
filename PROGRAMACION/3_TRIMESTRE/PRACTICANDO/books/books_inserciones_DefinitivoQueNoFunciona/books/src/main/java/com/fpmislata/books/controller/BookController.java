package com.fpmislata.books.controller;

import com.fpmislata.books.common.ioc.BookIOC;
import com.fpmislata.books.common.ioc.CharacterMovieIOC;
import com.fpmislata.books.common.ioc.EditorialIOC;
import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.CharacterMovieService;
import com.fpmislata.books.domain.service.EditorialService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    BookService bookService;
    EditorialService editorialService = EditorialIOC.getEditorialService();

    CharacterMovieService characterMovieService = CharacterMovieIOC.getCharacterMovieService();

    public BookController() {
        this.bookService = BookIOC.getBookService();
    }

    @GetMapping("")
    public String findAll(Model model) {
        model.addAttribute("BookList", this.bookService.findAll());
        return "bookList";
    }

    @GetMapping("/{id}")
    public String findByBookId(Model model, @PathVariable int id) {
        model.addAttribute("book", bookService.findBookById(id));
        return "bookDetails";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("editorialList", editorialService.findAll());
        model.addAttribute("characterMovieList", characterMovieService.findAll());
        return "form";
    }

    @PostMapping("")
    public String saveBook(@RequestParam String title, @RequestParam String editorialName,
                           @RequestParam List<String> characterNameMovieList, @RequestParam int year) {

        bookService.create(title, editorialName, characterNameMovieList, year);

        return "redirect:/books";
    }
}
