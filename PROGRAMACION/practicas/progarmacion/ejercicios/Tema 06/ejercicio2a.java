import java.util.Scanner;
public class ejercicio2a {

    static int menu(){
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.println("1.- Opcion A");
        System.out.println("2.- Opcion B");
        System.out.println("3.- Opcion C");
        System.out.println("---------------------");
        System.out.print("Opcion:");
        numero = reader.nextInt();
        return numero;
    }

    public static void main(String[] args){
      int numero;

      numero = menu();
        System.out.println("Ha elegido la opcion " + Integer.toString(numero));

    }

}

