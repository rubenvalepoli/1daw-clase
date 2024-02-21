package com.fpmislata.estudiando.controller;

import com.fpmislata.estudiando.common.AuthorIoCContainer;
import com.fpmislata.estudiando.common.BookIoCContainer;
import com.fpmislata.estudiando.domain.service.AuthorService;
import com.fpmislata.estudiando.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.estudiando.persistence.AuthorRepository;
import com.fpmislata.estudiando.persistence.impl.AuthorRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/books")
@Controller
public class AuthorController {

    private AuthorService author;


    public AuthorController() {
        this.author = AuthorIoCContainer.getAuthorService();
    }

    @GetMapping("/author")
    public String author(Model model){
        model.addAttribute("author",this.author.findAll());
        return "author";
    }


}
