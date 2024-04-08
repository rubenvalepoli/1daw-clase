import java.util.Scanner;
public class ejercicio2c {

    static  Scanner reader = new Scanner(System.in);

    static void iniciar(int tamanyo, int[] numbers){
        for (int recorre = 0; recorre < numbers.length; recorre++) {
            System.out.print("Escribe el elemento " + recorre + " :");
            numbers[recorre] = reader.nextInt();
        }
    }

    static void mostrar(int[] numbers) {
        for (int numero : numbers) {
            System.out.print(numero);
        }
    }


    public static void main(String[] args){

        int tamanyo;
        System.out.print("De que tamanyo quieres que sea el array: ");
        tamanyo =  reader.nextInt();
        int[] numbers = new int [tamanyo];

        iniciar(tamanyo, numbers);
        mostrar(numbers);
    }
}