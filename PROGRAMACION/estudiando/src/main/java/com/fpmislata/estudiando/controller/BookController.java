package com.fpmislata.estudiando.controller;

import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.domain.service.impl.BooksServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/books")
@Controller
public class BookController {

    private BooksServiceImpl service = new BooksServiceImpl();

    @GetMapping
    public String findall(Model model){
        model.addAttribute("books",this.service.findall());
        return "bookList";
    }

    @GetMapping("/{id}")
    public String findById (Model model, @PathVariable int id){
        Book book = service.findById(id);
        if (book == null){
            return "error";
        }
        model.addAttribute("books",book);
        return "detailsBook";
    }



}
