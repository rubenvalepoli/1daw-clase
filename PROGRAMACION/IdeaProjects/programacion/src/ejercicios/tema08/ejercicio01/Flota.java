package ejercicios.tema08.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Flota {

    private List<Coche> listCoches =new ArrayList<>();

    public void addCar(Coche coche){
        listCoches.add(coche);
    }

    public boolean removeCar(int numeroBastidor) {

        for (Coche coche : listCoches) {
            System.out.println("Comprobando coche");
            if (coche.getNumeroBastidor() == numeroBastidor) {
                System.out.println("BOrraqr coche");

            }


        }

    }

}
