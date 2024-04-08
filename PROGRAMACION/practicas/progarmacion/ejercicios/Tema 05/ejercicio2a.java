import java.util.Scanner;
public class ejercicio2a {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Introduce el primer numero: ");
        numero1 = reader.nextInt();
        System.out.print("Introduce el segundo numero: ");
        numero2 = reader.nextInt();
        if (numero1 < numero2){
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("El numero mayor es: " + numero1);
        }
    }

}