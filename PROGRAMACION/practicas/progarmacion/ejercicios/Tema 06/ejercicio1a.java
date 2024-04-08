import java.util.Scanner;
public class ejercicio1a {

    static int sumar(int a, int b){

        return a + b;
    }

    static int restar(int a, int b){

        return a - b;
    }


    static int multiplicacion(int a, int b){

        return a * b;
    }


    static float division(int a, int b){

        return ((float) a) / ((float) b);

    }


    public static void main(String[] args){
        int a, b;
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe el primer numero: ");
        a =  reader.nextInt();
        System.out.print("Escribe el segundo numero: ");
        b =  reader.nextInt();
        System.out.println("Sumar: " + Integer.toString(sumar(a,b)));
        System.out.println("Restar: " + Integer.toString(restar(a,b)));
        System.out.println("Multiplicacion: " + Integer.toString(multiplicacion(a,b)));
        System.out.println("Division: " + Float.toString(division(a,b)));

    }
}