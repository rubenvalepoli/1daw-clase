package com.fpmislata.estudiando2.controller;

import com.fpmislata.estudiando2.domine.entity.Book;
import com.fpmislata.estudiando2.domine.service.BooksService;
import com.fpmislata.estudiando2.domine.service.impl.BooksServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@Controller
public class BookController {

    private BooksService service = new BooksServiceImpl();




    @GetMapping
    public String getAll(Model model){
        model.addAttribute("books",this.service.getAll());
        return "bookList";
    }

    @GetMapping("/{id}")
    public String findById(Model model,@PathVariable Integer id){
        Book book = service.findById(id);
        if (book == null){
            return "error";
        }
        model.addAttribute("books",book);
        return "bookDetails";
    }

    @GetMapping("/new")
    public String createbook(Model model){
        return "createBook";
    }

    @PostMapping("/books")
    public String insert(@RequestParam("id")String id,@RequestParam("title") String title,@RequestParam("author") String author){
        Book book = new Book(Integer.parseInt(id),title,author);
        service.createbook(book);
        return "/books";
    }


}
