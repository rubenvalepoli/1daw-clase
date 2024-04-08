import java.util.Scanner;

public class ejercicio1c {
 
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        float first, second;

        System.out.print("Pon un numero: ");
        first = scanner.nextInt();

        System.out.print("Pon otro numero: ");
        second = scanner.nextInt();

        System.out.println("La suma de: " + first + " + " + second +" = " + String.format("%.2f",(first+second)));
        System.out.println("La resta de: " + first + " - " + second +" = " + String.format("%.2f",(first-second)));
        System.out.println("La multiplicacion de: " + first + " x " + second +" = " + String.format("%.2f",(first*second)));
        System.out.println("La division de: " + first + " / " + second +" = " + String.format("%.2f",(first/second)));
        System.out.println("El resto de la division de: " + first + " % " + second +" = " + String.format("%.2f",(first%second)));

        
    }
}