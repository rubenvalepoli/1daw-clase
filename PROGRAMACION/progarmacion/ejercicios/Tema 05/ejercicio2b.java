import java.util.Scanner;
public class ejercicio2b {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        int numero1;
        int numero2;
        String frase;
        System.out.print("Introduce el primer numero: ");
        numero1 = reader.nextInt();
        System.out.print("Introduce el segundo numero: ");
        numero2 = reader.nextInt();

        frase = (numero1 < numero2)? "El mayor es: " +numero2 : "El mayor es: " +numero1;
        System.out.println(frase);

    }

}