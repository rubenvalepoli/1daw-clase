package estudiando;

import java.util.Scanner;

public class Coche {
    static Scanner scanner = new Scanner(System.in);
    String marca,modelo,color;

    int numeroBastidor,velocidad = 0;

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

    public void acelerar(){

        System.out.println("dime la velocidad que le quieres aumentar: ");
        int aumentar = scanner.nextInt();
        this.velocidad += aumentar;
    }
    public void frenar(){
        System.out.println("dime la velocidad que le quieres disminuir: ");
        int disminuir = scanner.nextInt();
        this.velocidad -= disminuir;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numeroBastidor=" + numeroBastidor +
                ", velocidad=" + velocidad +
                '}';
    }
}
