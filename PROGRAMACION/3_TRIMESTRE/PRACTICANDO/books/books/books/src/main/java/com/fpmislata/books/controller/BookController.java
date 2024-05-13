package com.fpmislata.books.controller;

import com.fpmislata.books.common.ioc.BookIOC;
import com.fpmislata.books.domain.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/{id}")
    public String delete (@PathVariable int id){
        //bookService.deleteAuthorByBookID(id);
       // bookService.deleteCharacterMovieByBookID(id);
        bookService.deleteBook(id);
        return "redirect:/books";
    }

/*    @PutMapping("/{id}")
    public String update(@PathVariable Integer id, @RequestParam String name,@RequestParam Integer year){
    //public String update(@PathVariable Integer id, @RequestParam String name,@RequestParam Integer year,@RequestParam String editorialName, @RequestParam List<String> charactersList){
        //bookService.update(id,name,year,editorialName,charactersList);
        bookService.update(id,name,year);
        return "redirect:/books";
    }*/


}
