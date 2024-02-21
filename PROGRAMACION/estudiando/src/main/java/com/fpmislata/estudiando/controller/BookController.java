package com.fpmislata.estudiando.controller;

import com.fpmislata.estudiando.common.BookIoCContainer;
import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.domain.service.AuthorService;
import com.fpmislata.estudiando.domain.service.BooksService;
import com.fpmislata.estudiando.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.estudiando.domain.service.impl.BooksServiceImpl;
import com.fpmislata.estudiando.persistence.BookRepository;
import com.fpmislata.estudiando.persistence.impl.BookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/books")
@Controller
public class BookController {

    private BooksService service;

    public BookController() {
        this.service = BookIoCContainer.getBooksService();
    }

 /*   AuthorService author;

    public BookController(AuthorService author) {
        this.author = author;
    }*/



    @GetMapping
    public String findall(Model model){
        model.addAttribute("books",this.service.findall());
        return "bookList";
    }
/*    @GetMapping("/author")
    public String author(Model model){
        model.addAttribute("author",this.author.findAll());
        return "author";
    }*/

    @GetMapping("/{id}")
    public String findById (Model model, @PathVariable int id){
        Book book = service.findById(id);

        if (book == null){
            return "error";
        }
        model.addAttribute("books",book);
        return "detailsBook";
    }

    @GetMapping("/addbook")
    public String addBook (Model model){
        Book book = new Book();
        model.addAttribute("books",book);
        return "addbook";
    }


    @PostMapping
    public String insert(@ModelAttribute Book book,Model model){
        model.addAttribute("books",book);
        service.addBook(book);
        return "bookList";
    }







}










/*    @PostMapping
    public String insert(@RequestParam("id") String id,@RequestParam("title") String title, @RequestParam("authorId") String authorId){
        Book book = new Book(Integer.parseInt(id),title, null);
        int authorId = Integer.parseInt(id);

        booksService.insert(book, authorId);
        return "redirect:/books";
    }*/

/*
    @GetMapping("/author")
    public String author(Model model){

        model.addAttribute("author",this.authorService.findAll());
        return "author";
    }
*/
   /* @GetMapping("/new")
    public String author(Model model){
        AuthorService author = new AuthorServiceImpl();
        author.findAll();
        model.addAttribute("author",author);
        return "author";
    }
*/

