package com.fpmislata.estudiando.controller;

import com.fpmislata.estudiando.domain.service.AuthorService;
import com.fpmislata.estudiando.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.estudiando.persistence.dao.AuthorDao;
import com.fpmislata.estudiando.persistence.repository.AuthorRepository;
import com.fpmislata.estudiando.persistence.repository.impl.AuthorRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/books")
@Controller
public class AuthorController {

    private AuthorService author;




   public AuthorController() {
        AuthorRepository authorRepository = new AuthorRepositoryImpl();
        this.author = new AuthorServiceImpl(authorRepository);
    }

    @GetMapping("/author")
    public String author(Model model){
        model.addAttribute("author",this.author.findAll());
        return "author";
    }


}
