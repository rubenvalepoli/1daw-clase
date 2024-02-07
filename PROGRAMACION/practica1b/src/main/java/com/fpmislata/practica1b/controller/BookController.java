package com.fpmislata.practica1b.controller;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.BooksService;
import com.fpmislata.practica1b.domain.service.impl.BooksServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BookController {

    private BooksServiceImpl service = new BooksServiceImpl();


/*    public List<Book> getAll(){
        return this.service.getAll();
    }*/

    @GetMapping("/book")
    public String findAll(Model model){
        List<Book> bookList = BooksService.getAll();
        model.addAttribute("listadolibros", bookList);
        return "bookList";
    }

}
