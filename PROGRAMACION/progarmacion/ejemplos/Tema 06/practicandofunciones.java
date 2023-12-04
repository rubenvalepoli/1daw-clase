import java.util.Scanner;
public class practicando {

    static int sumar(int a, int b){
        return a + b;
    }

    static int restar(int a, int b){
        return a - b;
    }

    static int multiplicacion(int a, int b){
        return a * b;
    }

    public static void main(String[] args){
        int a, b;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        a =  reader.nextInt();
        System.out.print("Escribe el segundo número: ");
        b =  reader.nextInt();
        System.out.println("Sumar: " + Integer.toString(sumar(a,b)));
        System.out.println("Restar: " + Integer.toString(restar(a,b)));
        System.out.println("Multiplicacion: " + Integer.toString(multiplicacion(a,b)));

    }
}