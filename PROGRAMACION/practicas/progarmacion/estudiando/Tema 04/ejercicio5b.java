import java.util.Scanner;
import java.util.Random;

public class ejercicio5b {
     public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minimum, maximum;

        System.out.print("Pon el minimo: ");
        minimum = scanner.nextInt();

        System.out.print("Pon el maximo: ");
        maximum = scanner.nextInt();
        

        Random random = new Random();
        int number = random.nextInt(maximum - minimum +1)+minimum;

        System.out.println(number);



    }
}
