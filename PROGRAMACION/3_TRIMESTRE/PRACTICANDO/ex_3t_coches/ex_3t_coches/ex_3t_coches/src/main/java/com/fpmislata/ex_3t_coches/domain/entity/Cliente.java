package com.fpmislata.ex_3t_coches.domain.entity;

import java.util.Objects;

public class Cliente {
    private int clientid;
    private String nombre;
    private String apellido;
private String ciudad;

    public Cliente(int clientid, String nombre, String apellido, String ciudad) {
        this.clientid = clientid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }

    public Cliente() {
    }

    public Cliente(int clientid) {
        this.clientid = clientid;
    }


    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return clientid == cliente.clientid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientid);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
