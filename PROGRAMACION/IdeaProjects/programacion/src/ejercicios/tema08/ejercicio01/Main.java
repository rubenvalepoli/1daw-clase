package ejercicios.tema08.ejercicio01;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        Flota flota = new Flota();
        Conductor conductor1 = new Conductor();
        Conductor conductor2 = new Conductor();
        Conductor conductor3 = new Conductor();

        conductor1.setNombre("pepe");
        conductor2.setNombre("Ruben");
        conductor3.setNombre("Sole");

        coche1.setColor("rojo");
        coche1.setMarca("Ford");
        coche1.setModelo("Fiesta");
        coche1.setNumeroBastidor(128867);
        coche1.setVelocidad(10);

        coche2.setColor("gris");
        coche2.setMarca("Opel");
        coche2.setModelo("Zafira");
        coche2.setNumeroBastidor(123456);
        coche2.setVelocidad(30);

        coche3.setColor("amarillo");
        coche3.setMarca("KIA");
        coche3.setModelo("Rio");
        coche3.setNumeroBastidor(8624594);
        coche3.setVelocidad(50);


       /* EJERCICIO 1 System.out.println(String.format("Mi coche es un %s %s de color %s con número de bastidor %d",
            coche1.getMarca(),
            coche1.getModelo(),
            coche1.getColor(),
            coche1.getNumeroBastidor())
        );*/

//        System.out.println(coche1.toString());

/*      EJERCICIO 3
        System.out.println("La velocidad del coche es " + coche1.getVelocidad());
        coche1.acelerar(5);
        System.out.println("La velocidad del coche es " + coche1.getVelocidad());

        System.out.println("La velocidad del coche es " + coche1.getVelocidad());
        coche1.reducir(5);
        System.out.println("La velocidad del coche es " + coche1.getVelocidad());
*/


/* EJERCICIO 4

        System.out.println(coche1.getVelocidad());
        System.out.println(coche1.aumentarvelocidad());
        System.out.println(coche1.disminuirvelocidad());*/

/*EJERCICIO 5*/

 /*   flota.addCar(coche1);
    flota.addCar(coche2);
    flota.addCar(coche3);*/

//    flota.showcoche();



//    flota.showcoche();


/*EJERCICIO 7*/

/*        flota.addCar(coche1);
        flota.addCar(coche2);
        flota.addCar(coche3);

        flota.toString();
        flota.removeCar(coche3.getNumeroBastidor());
        flota.toString();*/

/*EJERCICIO 8*/

        conductor1.cocheasignado(coche1);
        conductor1.mostrarcocheasignado();
        conductor2.cocheasignado(coche2);
        conductor2.mostrarcocheasignado();
        conductor3.cocheasignado(coche3);
        conductor3.mostrarcocheasignado();


    }
}
