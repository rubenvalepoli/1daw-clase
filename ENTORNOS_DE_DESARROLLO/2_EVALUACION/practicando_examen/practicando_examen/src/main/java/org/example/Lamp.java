package org.example;

public class Lamp {

    public boolean turnedOff;
    double consuption;
    boolean turnedOn;


    public Lamp(double consuption) {
        this.consuption = consuption;
    }

    public Lamp(double consuption, boolean turnedOn) {
        this.consuption = consuption;
        this.turnedOn = turnedOn;
    }

    public double getConsuption() {
        return consuption;
    }

    public void setConsuption(double consuption) {
        this.consuption = consuption;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }


    public void turnedOn() {
        turnedOn=true;
    }
    public void turnedOff() {
        turnedOn=false;
    }

    public void toggle() {
        turnedOn = !turnedOn;
    }

    public double consume(double sec) {
        if(!turnedOn){
            return 0;
        }
        return consuption*sec/3600;
    }
}
