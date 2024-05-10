package com.fpmislata.ex_3t_coches.domain.service;

import com.fpmislata.ex_3t_coches.domain.entity.Car;

import java.util.List;

public interface CarService {
    public Car findById(Integer carId);
    public List<Car> findAll();
    public void delete(Integer carId);
    public void insert(Car car);

}
