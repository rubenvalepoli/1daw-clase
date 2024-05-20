package org.example.persistence.repository;


import org.example.controller.Car;
import org.example.exception.ResourceNotFoundException;

import java.util.List;

public interface CarRepository {

    List<Car> findAll();
    Car findByPlate(String plate) throws ResourceNotFoundException;
}