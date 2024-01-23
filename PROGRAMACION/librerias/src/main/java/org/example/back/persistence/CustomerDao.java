package org.example.back.persistence;

import org.example.back.domain.Customer;

import java.awt.*;
import java.util.List;

public class CustomerDao {

    private java.util.List<Customer> custumerList = java.util.List.of(
            new Customer(1234,"Pepe",4567),
            new Customer(4567,"Juan",8912),
            new Customer(7891,"Raul",3456)
    );



    public List<Customer> findAll(){
        return custumerList;
    }


}
