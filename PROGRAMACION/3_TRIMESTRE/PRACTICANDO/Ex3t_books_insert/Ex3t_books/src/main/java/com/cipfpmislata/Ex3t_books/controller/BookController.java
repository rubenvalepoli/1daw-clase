package com.cipfpmislata.Ex3t_books.controller;

import com.cipfpmislata.Ex3t_books.common.container.AuthorIOC;
import com.cipfpmislata.Ex3t_books.common.container.BookIOC;
import com.cipfpmislata.Ex3t_books.common.container.EditorialIOC;
import com.cipfpmislata.Ex3t_books.domain.entity.Books;
import com.cipfpmislata.Ex3t_books.domain.service.AuthorService;
import com.cipfpmislata.Ex3t_books.domain.service.BooksService;
import com.cipfpmislata.Ex3t_books.domain.service.EditorialService;
import com.google.protobuf.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/books")
public class BookController {


    private final BooksService booksService;
    private final EditorialService editorialService;
    private final AuthorService authorService;

    public BookController() {
        this.booksService=BookIOC.getBooksService();
        this.editorialService= EditorialIOC.getEditorialService();
        this.authorService=AuthorIOC.getAuthorService();
    }

    @GetMapping("")
    public String findAll(Model model) {
        model.addAttribute("bookList", booksService.findAll());
        return "books";
    }
    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable Integer id) {
        try {
            model.addAttribute("book", booksService.findById(id));
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
        return "bookDetail";
    }
    @GetMapping("/year/{year}")
    public String findByYear(Model model, @PathVariable Integer year){
        model.addAttribute("bookList", booksService.findAllByYear(year));
        return "books";
    }
    @GetMapping("/title/{title}")
    public String findByName(Model model, @PathVariable String title){
        model.addAttribute("bookList", booksService.findAllByName(title));
        return "books";
    }
    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("book", new Books());
        model.addAttribute("editorialList",editorialService.findAll());
        model.addAttribute("authorList", authorService.findAll());
        return "bookForm";
    }
    @PostMapping("")
    public String save(Books books){
        booksService.insert(books);
        return "redirect:/books";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        booksService.delete(id);
        return "redirect:/books";
    }
    /*
    @PutMapping("/{id}")
    public String update(@PathVariable int id, Model model,Books books){
        try {
            Books existingbook = booksService.findById(id);
            add(model);
            booksService.update(books);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
        return "redirect:/books";
    }
*/
}
