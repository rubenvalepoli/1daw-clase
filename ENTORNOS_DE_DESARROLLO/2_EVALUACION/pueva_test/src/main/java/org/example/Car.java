package org.example;

public class Car {
    private String plate;

    public Car(int velocity) {
        this.velocity = velocity;
    }

    private int velocity;

    public Car(String plate) {
        this.plate = plate;
    }

    public void accelerate(){
        accelerate(5);
    }

    public void accelerate(int velocity){
        this.velocity += velocity;
    }








    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

}
