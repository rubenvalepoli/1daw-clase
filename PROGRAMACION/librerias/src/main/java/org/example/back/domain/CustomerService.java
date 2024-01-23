package org.example.back.domain;

import org.example.back.persistence.CustomerDao;

import java.util.List;

public class CustomerService {

    CustomerDao customerDao = new CustomerDao();
    public List<Customer> findAll(){
        return customerDao.findAll();

    }

}
