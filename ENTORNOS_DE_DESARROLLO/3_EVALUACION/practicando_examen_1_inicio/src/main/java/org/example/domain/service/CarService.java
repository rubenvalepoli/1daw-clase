package org.example.domain.service;

import org.example.controller.Car;
import org.example.exception.ResourceNotFoundException;

import java.util.List;

public interface CarService {
    List<Car> findAll();
    Car findByPlate(String plate) throws  ResourceNotFoundException;
    void accelerate(Car car, double speed);
}