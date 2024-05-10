package com.fpmislata.ex_3t_coches.domain.entity;

import java.util.List;
import java.util.Objects;

public class Concesionario {
    private int concesionarioid;
    private String nombre;
    private String ciudad;
    private List<Car> carList;
    private List<Cliente> clienteList;

    public Concesionario(int concesionarioid, String nombre, String ciudad, List<Car> carList, List<Cliente> clienteList) {
        this.concesionarioid = concesionarioid;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.carList = carList;
        this.clienteList = clienteList;
    }

    public Concesionario(int concesionarioid, String nombre, String ciudad) {
        this.concesionarioid = concesionarioid;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getConcesionarioid() {
        return concesionarioid;
    }

    public void setConcesionarioid(int concesionarioid) {
        this.concesionarioid = concesionarioid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concesionario that = (Concesionario) o;
        return concesionarioid == that.concesionarioid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(concesionarioid);
    }

}
