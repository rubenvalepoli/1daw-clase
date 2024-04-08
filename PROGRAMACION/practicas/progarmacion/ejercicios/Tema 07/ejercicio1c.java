import java.util.Scanner;
public class ejercicio1c {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] *= numbers[i];
        }

        for (int numero : numbers){

            System.out.println(numero);
        }


    }
}