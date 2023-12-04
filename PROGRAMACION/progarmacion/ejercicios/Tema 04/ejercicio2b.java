import java.util.Scanner;
public class ejercicio2a {

    public static void main(String[] args) {
        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        double numero;
        System.out.println("Introduce un numero para sacar su raiz cuadrada: ");
        numero = reader.nextInt();
        double raizcuadrada = Math.sqrt(numero);
        String raizcuadradares = String.format("%.3f", raizcuadrada);


        System.out.println("La raiz cuadrada de " + numero + " es: " + raizcuadradares);
    }
}