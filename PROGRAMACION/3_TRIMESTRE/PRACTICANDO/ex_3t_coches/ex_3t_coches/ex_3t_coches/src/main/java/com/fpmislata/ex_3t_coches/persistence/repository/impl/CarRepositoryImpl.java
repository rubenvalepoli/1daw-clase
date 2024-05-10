package com.fpmislata.ex_3t_coches.persistence.repository.impl;

import com.fpmislata.ex_3t_coches.common.ioc.ClienteIOC;
import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.entity.Cliente;
import com.fpmislata.ex_3t_coches.persistence.Dao.CarDao;
import com.fpmislata.ex_3t_coches.persistence.Dao.ClienteDao;
import com.fpmislata.ex_3t_coches.persistence.repository.CarRepository;
import com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.mapper.ClienteMapper;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    private ClienteDao clienteDao;
    private CarDao carDao;

    public CarRepositoryImpl(CarDao carDao) {
        this.carDao = carDao;
        this.clienteDao = ClienteIOC.getClienteDao();
    }

    @Override
    public Car findById(Integer carId) {
        Car car = carDao.findById(carId);
        int clienteid = car.getPropietario().getClientid();
        Cliente propietario = clienteDao.findById(clienteid);
        car.setPropietario(propietario);
        return car;
    }

    @Override
    public List<Car> findAll() {
        List<Car> carList = carDao.findAll();
        for (Car car : carList) {
            int clienteid = car.getPropietario().getClientid();
            Cliente propietario = clienteDao.findById(clienteid);
            car.setPropietario(propietario);
        }
        return carList;
    }

    @Override
    public void delete(Integer carId) {
        carDao.delete(carId);

    }

    @Override
    public void insert(Car car) {
        carDao.insert(car);
    }
}
