package com.fpmislata.ex_3t_coches.domain.entity;

import java.util.Objects;

public class Car {
    private int carid;
    private String marca;
    private String modelo;
    private String matricula;
    private Cliente propietario;

    public Car() {
    }


    public Car(int carid, String marca, String modelo, String matricula, Cliente propietario) {
        this.carid = carid;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public Car(int carid, String marca, String modelo, String matricula) {
        this.carid = carid;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carid == car.carid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carid);
    }
}
