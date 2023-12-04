import java.util.Scanner;
public class ejercicio9a {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
        System.out.println("1.- Opcion A");
        System.out.println("2.- Opcion B");
        System.out.println("3.- Opcion C");
        System.out.println("---------------------");
        System.out.print("Opcion:");
        numero = reader.nextInt();
        System.out.println("Ha elegido la opcion " + numero);

    }

}
