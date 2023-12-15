package ejercicios.Tema082;

import ejercicios.Tema082.Coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Flota {
    static Scanner scanner = new Scanner(System.in);
    private List<ejercicios.Tema082.Coche> listCoches =new ArrayList<>();

    public void addCar(ejercicios.Tema082.Coche coche){
        listCoches.add(coche);


    }

    public boolean removeCar(int numeroBastidor) {

        System.out.print("dime el numero de bastidor del coche que quieres eliminar: ");
        numeroBastidor = scanner.nextInt();

        for (Coche coche : listCoches) {
            System.out.println("Comprobando coche");
            if (coche.getNumeroBastidor() == numeroBastidor) {

                System.out.println("Borrar coche");
                listCoches.remove(coche);
                System.out.println("se ha borrado el coche con numero de bastidor " + numeroBastidor);
                return true;

            } else if (coche.getNumeroBastidor() != numeroBastidor) {
                System.out.println("No se ha encontrado el coche con numero de bastidor " + numeroBastidor);
            }
        }
        return false;
    }

/*    public void showcoche (){
        System.out.println(listCoches);
    }*/
        public String toString(){
            System.out.println(listCoches);
            return getClass().getName() + "@" + Integer.toHexString(hashCode());

        }

}
