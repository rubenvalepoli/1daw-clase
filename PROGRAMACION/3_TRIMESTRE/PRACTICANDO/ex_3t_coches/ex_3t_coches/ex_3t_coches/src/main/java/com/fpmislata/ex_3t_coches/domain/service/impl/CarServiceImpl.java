package com.fpmislata.ex_3t_coches.domain.service.impl;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.service.CarService;
import com.fpmislata.ex_3t_coches.persistence.repository.CarRepository;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car findById(Integer carId) {
        return carRepository.findById(carId);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void delete(Integer carId) {
        carRepository.delete(carId);
    }

    @Override
    public void insert(Car car) {
        carRepository.insert(car);
    }
}
