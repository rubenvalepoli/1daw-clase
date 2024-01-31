package com.fpmislata.practica_sprint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        System.out.println("Metodo index de MainController ejecutandose");
        return "index";
    }

    @GetMapping("/about")
    public void about(){
        System.out.println("Metodo about de MainController ejecutandose");
    }

}
