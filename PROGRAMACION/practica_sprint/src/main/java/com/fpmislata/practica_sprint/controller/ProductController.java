package com.fpmislata.practica_sprint.controller;

import org.springframework.ui.Model;
import com.fpmislata.practica_sprint.domain.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@RequestMapping("/productos")
@Controller
public class ProductController {


    List<Product> productList = List.of(
      new Product(1,"Producto A","Marca A", new BigDecimal(23.99)),
      new Product(2,"Producto B","Marca A", new BigDecimal(14.99)),
      new Product(3,"Producto C","Marca B", new BigDecimal(68.99))
    );

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("products",this.productList);
        return "products";
    }
}


