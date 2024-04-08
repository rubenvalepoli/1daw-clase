import java.util.Scanner;
public class ejercicio3b {

    static int mayor( int a, int b){
        if (a > b){
            return 1;
        } else if (a < b){
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        int a, b;

        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe el primer numero: ");
        a =  reader.nextInt();
        System.out.print("Escribe el segundo numero: ");
        b =  reader.nextInt();
        switch (mayor(a, b)) {

            case 1 -> System.out.println("El mayor es: " + a);
            case -1 -> System.out.println("El mayor es: " + b);
            case 0 -> System.out.println("Los numeros son iguales");

        }
    }

}