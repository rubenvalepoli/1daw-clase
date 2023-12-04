import java.util.Scanner;

public class ejercicio1a {
    static Scanner scanner = new Scanner(System.in);
    static int first, second;
 
    public static void main (String[] args) {
        
        System.out.print("Pon un numero: ");
        first = scanner.nextInt();

        System.out.print("Pon otro numero: ");
        second = scanner.nextInt();

        System.out.println("La suma de: " + first + " + " + second +" = " + suma(second, first));
        System.out.println("La resta de: " + first + " - " + second +" = " +resta(second, first));
        System.out.println("La multiplicacion de: " + first + " x " + second +" = " +multiplicar(second, first));
        System.out.println("La division de: " + first + " / " + second +" = " +dividir(second, first));

    }

    public static int suma (int a, int b) {
       return a + b; 
    }
    public static int resta (int a, int b) {
       return a - b; 
    }
    public static int multiplicar (int a, int b) {
       return a * b; 
    }
    public static int dividir (int a, int b) {
            return a / b;           
    }

}



