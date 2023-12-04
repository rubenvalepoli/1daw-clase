import java.util.Scanner;
public class ejercicio2a {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int [] numbers = new int [5];

        for (int recorre = 0; recorre < numbers.length; recorre++) {
            System.out.print("Escribe el elemento " + recorre + ":");
            numbers [recorre] =  reader.nextInt();

        }

        for (int numero : numbers){

            System.out.print(numero);

        }
    }
}