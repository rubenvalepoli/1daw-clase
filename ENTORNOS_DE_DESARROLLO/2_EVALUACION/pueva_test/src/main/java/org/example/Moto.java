package org.example;

public class Moto {



    public int velicidad = 30;




    public Moto(int velicidad) {
        this.velicidad = velicidad;
    }

    public void acelerar(int aceleraion) {
        velicidad += aceleraion;
    }

    public void decelerar(int decelerar) {
        velicidad -= decelerar;
    }

    public int getVelicidad() {
        return velicidad;
    }

    public void setVelicidad(int velicidad) {
        this.velicidad = velicidad;
    }

    public void parar(int parar) {
        velicidad = 0;
    }

    public void adelantar(int adelantar) {
        velicidad += adelantar;
    }
}
