import java.util.Scanner;
public class ejercicio6b {

    static int sumarnaturales(int number) {
        int suma;
        if (number == 0) {
            return 0;
        } else if (number > 0) {
            suma = number + sumarnaturales(number - 1);
        } else {
            suma = number + sumarnaturales(number + 1);
        }
        return suma;
    }
    public static void main(String[] args){
        int number;
        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        number =  reader.nextInt();
        System.out.println("Resultado: " + sumarnaturales(number));

    }
}