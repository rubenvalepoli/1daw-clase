package com.fpmislata.Dependencias.controller;

import com.fpmislata.Dependencias.common.BookIoCContainer;
import com.fpmislata.Dependencias.domine.entity.Book;
import com.fpmislata.Dependencias.domine.service.BookService;
import com.fpmislata.Dependencias.domine.service.impl.BooksServiceImpl;
import com.fpmislata.Dependencias.dto.BookDto;
import com.fpmislata.Dependencias.persistence.BookRepository;
import com.fpmislata.Dependencias.persistence.impl.StaticBookRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/libros")
@Controller

public class BookController {

        private BookService service;

    public BookController() {
        //this.service = BookIoCContainer.getBookRepository();
    }


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
