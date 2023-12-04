import java.util.Scanner;
public class ejercicio3a {

    static int mayor( int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args){
        int a, b;

        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe el primer numero: ");
        a =  reader.nextInt();
        System.out.print("Escribe el segundo numero: ");
        b =  reader.nextInt();
        System.out.println("El mayor es: " + Integer.toString(mayor(a,b)));

    }

}