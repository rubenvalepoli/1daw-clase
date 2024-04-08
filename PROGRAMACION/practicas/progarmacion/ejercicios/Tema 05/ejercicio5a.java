import java.util.Scanner;
public class ejercicio5a {

    public static void main(String[] args){


        Scanner reader = new Scanner(System.in);
        int numero;
        int factorial = 1;
        System.out.print("Escribe un numero : ");
        numero = reader.nextInt();

        while (numero>1){
            factorial*=numero;
            numero--;
        }

        System.out.print("El factorial es " + factorial);

    }
}