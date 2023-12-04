import java.util.Scanner;
public class ejercicio2b {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int tamanyo;
        System.out.print("De que tamanyo quieres que sea el array: ");
        tamanyo =  reader.nextInt();

        int [] numbers = new int [tamanyo];

        for (int recorre = 0; recorre < numbers.length; recorre++) {
            System.out.print("Escribe el elemento " + recorre + " :");
            numbers [recorre] =  reader.nextInt();

        }

        for (int numero : numbers){

            System.out.print(numero);

        }
    }
}