package org.example;

public class Lamp {
    public boolean turnedOff;
    double consumo;
    boolean turnedOn;

    public Lamp(double consumo) {
        this.consumo = consumo;
    }

    public Lamp(double consumo, boolean turnedOn) {
        this.consumo = consumo;
        this.turnedOn = turnedOn;
    }
}
