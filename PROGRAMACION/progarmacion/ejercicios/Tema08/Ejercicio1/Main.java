package progarmacion.ejercicios.Tema08.Ejercicio1;

import progarmacion.ejercicios.Tema08.Ejercicio1.Coche;

public class Main {

    public static void main(String[] args) {
        
        Coche coche1 =new Coche();
        Coche coche2 = new Coche();
        Coche coche3 =new Coche();

        coche1.setColor("rojo");
        coche1.setMarca("Ford");
        coche1.setModelo("Fiesta");
        coche1.setNumeroBastidor(121145);
        

        System.out.println(String.format("Mi coche es un %s %s de color %s con número de bastidor %d", 
            coche1.getMarca(),
            coche1.getModelo(),
            coche1.getColor(),
            coche1.getNumeroBastidor())
        );

    }
}