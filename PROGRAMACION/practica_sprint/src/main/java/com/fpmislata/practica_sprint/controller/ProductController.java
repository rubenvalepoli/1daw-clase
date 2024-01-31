package com.fpmislata.practica_sprint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    @GetMapping("/productos/{id}")
    public void getById(@PathVariable("id") int id){
        System.out.println("Ruta: /productos/" + id);
    }
}
