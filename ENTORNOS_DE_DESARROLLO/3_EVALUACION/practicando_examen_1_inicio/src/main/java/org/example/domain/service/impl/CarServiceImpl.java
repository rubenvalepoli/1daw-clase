package org.example.domain.service.impl;

import org.example.controller.Car;
import org.example.domain.service.CarService;
import org.example.domain.service.IndicatorService;
import org.example.exception.ResourceNotFoundException;
import org.example.persistence.repository.CarRepository;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final IndicatorService indicatorService;


    public CarServiceImpl(CarRepository carRepository, IndicatorService indicatorService) {
        this.carRepository = carRepository;
        this.indicatorService = indicatorService;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findByPlate(String plate) throws ResourceNotFoundException {
        return carRepository.findByPlate(plate);
    }

    @Override
    public void accelerate(Car car, double speed) {
        car.accelerate(speed);
        indicatorService.showMaxSpeedIndicator(car.getSpeed() > 120);
    }
}

