package com.fpmislata.books.controller;

import com.fpmislata.books.common.ioc.BookIOC;
import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    BookService bookService;

    public BookController(){
        this.bookService = BookIOC.getBookService();
    }

    @GetMapping("")
    public String findAll(Model model){
        model.addAttribute("BookList",this.bookService.findAll());
        return "bookList";
    }


    @GetMapping("/{id}")
    public String findByBookId(Model model, @PathVariable int id){
        model.addAttribute("book",bookService.findBookById(id));
        return "bookDetails";
    }

    @PostMapping("/{id}")
    public String delete (@PathVariable int id) {
        bookService.deleteCharacterBooks(id);
        bookService.deleteBook(id);
        return "redirect:/books";
    }


}
