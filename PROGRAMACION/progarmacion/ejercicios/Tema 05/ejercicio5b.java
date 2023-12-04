import java.util.Scanner;
public class ejercicio5b {

    public static void main(String[] args){


        Scanner reader = new Scanner(System.in);
        int numero;
        int factorial = 1;
        System.out.print("Escribe un numero : ");
        numero = reader.nextInt();

        for(int index = 2; index<=numero;index++) {
            factorial *= index;

        }
        System.out.println("El factorial es " + factorial);

    }
}