import java.util.Scanner;
public class ejercicio9b {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
        numero = 5;
        while (numero != 0){
            System.out.println("0.- Opcion Salir");
            System.out.println("1.- Opcion A");
            System.out.println("2.- Opcion B");
            System.out.println("3.- Opcion C");
            System.out.println("---------------------");
            System.out.print("Opcion:");
            numero = reader.nextInt();
            System.out.println("Ha elegido la opcion " + numero);
        }
    }

}