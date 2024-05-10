package com.fpmislata.ex_3t_coches.persistence.Dao.jdbc.db;


import com.fpmislata.ex_3t_coches.common.AppPropertiesReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final Connection connection;

    private final AppPropertiesReader appPropertiesReader = AppPropertiesReader.getInstance();

    public DBConnection() {
        System.out.println("Establishing connection with the database...");
        try {
            connection = DriverManager.getConnection(
                    appPropertiesReader.getProperty("nutrifusionfood.datasource.url"),
                    appPropertiesReader.getProperty("nutrifusionfood.datasource.username"),
                    appPropertiesReader.getProperty("nutrifusionfood.datasource.password")
            );
            System.out.println("Connection established with the database");
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database.");
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
