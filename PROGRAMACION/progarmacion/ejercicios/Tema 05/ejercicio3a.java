import java.util.Scanner;
public class ejercicio3a {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero para saver si es par o impar: ");
        numero = reader.nextInt();

        if (numero % 2 ==0){
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }

}