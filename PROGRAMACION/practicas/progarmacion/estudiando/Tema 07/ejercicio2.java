import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int tamanyo;
        System.out.print("Introduce el tamanyo del array: ");
        tamanyo = scanner.nextInt();

        int [] numbers = new int [tamanyo];

            for (int i = 0; i < numbers.length; i++){
                               
                System.out.print("Escribe el elemento" + i + ":");
                numbers[i] = scanner.nextInt();
            }

            for (int numero : numbers){
                System.out.println(numero);
            }
        }

}