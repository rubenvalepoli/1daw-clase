import java.util.Scanner;
public class ejercicio2c {

    static int numero;
    static int menu(){
        Scanner reader = new Scanner(System.in);
        System.out.println("0.- Opcion Salir");
        System.out.println("1.- Opcion A");
        System.out.println("2.- Opcion B");
        System.out.println("3.- Opcion C");
        System.out.println("---------------------");
        System.out.print("Opcion:");
        numero = reader.nextInt();
        return numero;
    }

    public static void main(String[] args){

        do{
            numero = menu();
            System.out.println("Ha elegido la opcion " + Integer.toString(numero));
        } while (numero != 0);


    }

}