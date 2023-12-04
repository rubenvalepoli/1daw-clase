package progarmacion.ejercicios.Tema08.Ejercicio1;

import java.util.Scanner;

public class Coche {
    static Scanner scanner = new Scanner(System.in);


    private String marca, modelo, color;
    private int numeroBastidor, velocidad = 0;
    
   
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
  
     public int getNumeroBastidor() {
        return numeroBastidor;
    }
    public void setNumeroBastidor(int numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



}