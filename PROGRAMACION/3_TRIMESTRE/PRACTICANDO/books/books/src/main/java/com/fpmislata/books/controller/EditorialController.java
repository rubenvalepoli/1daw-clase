package com.fpmislata.books.controller;

import com.fpmislata.books.domain.entity.Editorial;
import org.springframework.ui.Model;
import com.fpmislata.books.common.ioc.BookIOC;
import com.fpmislata.books.common.ioc.EditorialIOC;
import com.fpmislata.books.domain.service.BookService;
import com.fpmislata.books.domain.service.EditorialService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editorials")
public class EditorialController {
    EditorialService editorialService;

    public EditorialController(){
        this.editorialService = EditorialIOC.getEditorialService();
    }

    @GetMapping("")
    public String findAll(Model model){
        model.addAttribute("EditorialList",this.editorialService.findAll());
        return "editorialList";
    }


    @GetMapping("/add")
    public String newEditorial(Model model) {
        Editorial editorial = new Editorial();
        model.addAttribute("editorial", editorial);
        return "editorialAddForm";
    }

    @PostMapping
    public String save(Editorial editorial){
        editorialService.insert(editorial);
        return "redirect:/editorials";
    }


}
