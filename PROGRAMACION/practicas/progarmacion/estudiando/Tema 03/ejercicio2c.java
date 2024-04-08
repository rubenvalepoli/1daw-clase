import java.util.Scanner;

public class ejercicio2c {
 
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Pon el numero que quieres miltiplicar: ");
        number = scanner.nextInt();

        
        int multiplicar = 0;

        while (multiplicar < 11) {
            System.out.println(number + "x" + multiplicar + ": " + (number*multiplicar) );
            multiplicar ++;
            
        }

    }
}
