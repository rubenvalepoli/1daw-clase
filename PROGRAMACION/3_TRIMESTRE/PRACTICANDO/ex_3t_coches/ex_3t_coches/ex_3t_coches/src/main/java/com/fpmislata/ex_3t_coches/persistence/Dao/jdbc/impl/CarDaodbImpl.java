package com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.impl;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.persistence.Dao.CarDao;
import com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.db.Rawsql;
import com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.mapper.CarMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDaodbImpl implements CarDao {

    @Override
    public Car findById(Integer carId) {
        try {
            String sql = "select * from coche where id=?";
            List<Object> params = List.of(carId);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return CarMapper.toCar(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Car> findAll() {
        try {
            String sql = "select * from coche";
            ResultSet resultSet = Rawsql.select(sql, null);
            List<Car> carlist = new ArrayList<>();
            while (resultSet.next()) {
                carlist.add(CarMapper.toCar(resultSet));
            }
            return carlist;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer carId) {
        String sql = "delete from coche where id=?";
        List<Object> params = List.of(carId);
        Rawsql.delete(sql, params);

    }

    @Override
    public void insert(Car car) {
        String sql = " INSERT INTO coche VALUES(?,?,?,?)";
        List<Object> params = List.of(car.getCarid(),car.getMarca(), car.getModelo(), car.getMatricula());
        Rawsql.insert(sql,params);
    }
}
