import java.util.Scanner;

public class ejercicio1b {
 
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int base;
        int altura;
        float area;

        System.out.print("Escribe la base: ");
        base = scanner.nextInt();
        System.out.print("Escribe la altura: ");
        altura = scanner.nextInt();
       

        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
