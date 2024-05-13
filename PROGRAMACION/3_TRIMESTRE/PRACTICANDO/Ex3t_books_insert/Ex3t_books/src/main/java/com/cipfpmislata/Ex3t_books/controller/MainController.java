package com.cipfpmislata.Ex3t_books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    public MainController() {
    }

    @GetMapping("/home")
    public String showMainPage() {
        return "index";
    }
}
