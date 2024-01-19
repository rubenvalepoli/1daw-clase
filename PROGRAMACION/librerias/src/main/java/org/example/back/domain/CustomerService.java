package org.example.back.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public static List <Customer> costumerList = new ArrayList<>();
    public static void findAll(){



        Customer customer1 = new Customer(1234,"Pepe",4567);
        Customer customer2 = new Customer(4567,"Juan",8912);
        Customer customer3 = new Customer(7891,"Raul",3456);

        costumerList.add(customer1);
        costumerList.add(customer2);
        costumerList.add(customer3);


    }

}
