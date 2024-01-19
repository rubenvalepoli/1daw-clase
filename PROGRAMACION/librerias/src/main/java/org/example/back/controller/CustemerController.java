package org.example.back.controller;

import org.example.back.domain.CustomerService;

public class CustemerController {
    public void findAll(){


        System.out.println("Listado de todos los clientes");

        System.out.println(CustomerService.costumerList);

    }


}
