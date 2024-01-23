package org.example.back.controller;

import org.example.back.domain.Customer;
import org.example.back.domain.CustomerService;

import java.util.List;

public class CustemerController {

    CustomerService customerService = new CustomerService();


    public List<Customer> findAll(){


        System.out.println("Listado de todos los clientes");


        return customerService.findAll();



//        System.out.println(CustomerService.costumerList);
//        System.out.println(CustomerService.getCostumerList());

    }


}
