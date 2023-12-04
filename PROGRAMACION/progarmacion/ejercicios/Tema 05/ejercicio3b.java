import java.util.Scanner;
public class ejercicio3b {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        int numero;
        String frase;
        System.out.print("Introduce un numero para saver si es par o impar: ");
        numero = reader.nextInt();

        frase = (numero % 2 ==0)? "El numero " + numero + " es par" : "El numero " + numero + " es impar";
        System.out.print(frase);

    }

}