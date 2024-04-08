package ejercicios.Tema082;

import ejercicios.Tema082.Coche;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche(123456);
        Coche coche3 = new Coche(8624594);
        Flota flota = new Flota();
        Conductor conductor1 = new Conductor("pepe");
        Conductor conductor2 = new Conductor("Ruben");
        Conductor conductor3 = new Conductor("Sole");


        coche1.setColor("rojo");
        coche1.setNumeroBastidor(128867);
        coche1.setMarca("Ford");
        coche1.setModelo("Fiesta");
        coche1.setVelocidad(10);

        coche2.setColor("gris");
        coche2.setMarca("Opel");
        coche2.setModelo("Zafira");
        coche2.setVelocidad(30);

        coche3.setColor("amarillo");
        coche3.setMarca("KIA");
        coche3.setModelo("Rio");
        coche3.setVelocidad(50);


        conductor1.cocheasignado(coche1);
        conductor1.mostrarcocheasignado();
        conductor2.cocheasignado(coche2);
        conductor2.mostrarcocheasignado();
        conductor3.cocheasignado(coche3);
        conductor3.mostrarcocheasignado();


    }
}
