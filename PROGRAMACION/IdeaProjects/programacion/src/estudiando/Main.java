package estudiando;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        Flota flota = new Flota();
        Conductor conductor1 = new Conductor();
        Conductor conductor2 = new Conductor();
        Conductor conductor3 = new Conductor();

        conductor1.setNombre("Pepe");
        conductor2.setNombre("Maria");
        conductor3.setNombre("Juan");


        coche1.setMarca("Kia");
        coche1.setModelo("Rio");
        coche1.setColor("Rojo");
        coche1.setNumeroBastidor(12345);
        coche1.setVelocidad(20);

        coche2.setMarca("Ford");
        coche2.setModelo("Fiesta");
        coche2.setColor("Blanco");
        coche2.setNumeroBastidor(45678);

        coche3.setMarca("Dacia");
        coche3.setModelo("Lodgy");
        coche3.setColor("Gris cometa");
        coche3.setNumeroBastidor(34567);

        conductor1.cocheasignado(coche1);
        conductor1.mostrarcocheasignado();
        conductor2.cocheasignado(coche2);
        conductor2.mostrarcocheasignado();
        conductor3.mostrarcocheasignado();


    }
}





/*Del ejercicio 1 al 4*/
 /*       System.out.println("Mi coche es un " + coche1.marca + " " + coche1.modelo + " de color " + coche1.color + " con un numero de bastidor " + coche1.numeroBastidor);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());

        System.out.println(coche1.velocidad);

        coche1.acelerar();

        System.out.println(coche1.velocidad);

        coche1.frenar();

        System.out.println(coche1.velocidad);*/



/* del 5 al 7
        flota.anyadirCoche(coche1);
        flota.anyadirCoche(coche2);
        flota.anyadirCoche(coche3);

        System.out.println(flota.toString());


        flota.eliminarcoche(coche2.numeroBastidor);

        System.out.println(flota.toString());*/