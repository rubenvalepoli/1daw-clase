package estudiando;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flota {
    static Scanner scanner = new Scanner(System.in);
    private List<Coche> lististcoches =new ArrayList<>();


    public void anyadirCoche (Coche coche){
        lististcoches.add(coche);
    }

    public boolean eliminarcoche (int numerodebastidor){

        System.out.println("DIme el numero de bastidor que quieres eliminar: ");
        int eliminarbastidor = scanner.nextInt();

        for (Coche coche : lististcoches){

            if (coche.getNumeroBastidor() == eliminarbastidor){

                System.out.println("eliminando coche");

                lististcoches.remove(coche);
                System.out.println("se la eliminado el coche con el numero de bastidor " + numerodebastidor);

                return true;

            }else {
                System.out.println("El numero de bastidor no pertenece a ningun coche");
            }

        }
        return false;
    }

    @Override
    public String toString() {
        return "Flota{" +
                "lististcoches=" + lististcoches +
                '}';
    }

/*    public void mostrarcoches(){

        System.out.println(lististcoches);

    }*/

}
