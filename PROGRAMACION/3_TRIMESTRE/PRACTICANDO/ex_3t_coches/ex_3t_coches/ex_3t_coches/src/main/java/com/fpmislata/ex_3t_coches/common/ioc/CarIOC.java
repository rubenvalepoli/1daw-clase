package com.fpmislata.ex_3t_coches.common.ioc;

import com.fpmislata.ex_3t_coches.domain.service.CarService;
import com.fpmislata.ex_3t_coches.domain.service.impl.CarServiceImpl;
import com.fpmislata.ex_3t_coches.persistence.Dao.CarDao;
import com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.impl.CarDaodbImpl;
import com.fpmislata.ex_3t_coches.persistence.repository.CarRepository;
import com.fpmislata.ex_3t_coches.persistence.repository.impl.CarRepositoryImpl;

public class CarIOC {
    private static CarService carService;

  private  static CarDao carDao;
  private static CarRepository carRepository;

    public static CarService getCarService() {
        if(carService==null){
            carService= new CarServiceImpl(getCarRepository());
        }
        return carService;
    }

    public static void setCarService(CarService carService) {
        CarIOC.carService = carService;
    }

    public static CarDao getCarDao() {
        if(carDao==null){
            carDao= new CarDaodbImpl();
        }
        return carDao;
    }

    public static void setCarDao(CarDao carDao) {
        CarIOC.carDao = carDao;
    }

    public static CarRepository getCarRepository() {
        if(carRepository==null){
            carRepository= new CarRepositoryImpl(getCarDao());
        }
        return carRepository;
    }

    public static void setCarRepository(CarRepository carRepository) {
        CarIOC.carRepository = carRepository;
    }
}
