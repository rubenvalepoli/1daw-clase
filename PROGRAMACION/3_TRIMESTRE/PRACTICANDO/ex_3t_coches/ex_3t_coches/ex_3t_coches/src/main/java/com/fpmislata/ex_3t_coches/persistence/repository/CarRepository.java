package com.fpmislata.ex_3t_coches.persistence.repository;

import com.fpmislata.ex_3t_coches.domain.entity.Car;

import java.util.List;

public interface CarRepository {
    public Car findById(Integer carId);
    public List<Car> findAll();
    public void delete(Integer carId);
    public void insert(Car car);
}
