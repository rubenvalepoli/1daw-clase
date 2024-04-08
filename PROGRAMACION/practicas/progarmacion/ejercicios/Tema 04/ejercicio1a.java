import java.util.Scanner;
public class ejercicio1a {

    public static void main(String[] args)
    {
    String cadenaCaracteres;
    Scanner reader = new Scanner(System.in);
    float numerouno;
    float numerodos;
    System.out.println("Introduce el primer numero");
    numerouno = reader.nextInt();
    System.out.println("Introduce el segundo numero");
    numerodos = reader.nextInt();
    System.out.println("La suma de los dos numeros es: " + (numerouno + numerodos));
    System.out.println("La resta de los dos numeros es:" + (numerouno - numerodos));
    System.out.println("La multiplicacion de los dos numeros es:" + (numerouno * numerodos));
    System.out.println("La division de los dos numeros es:" + (numerouno / numerodos));
    System.out.println("El resto de la division de los dos numeros es:" + (numerouno % numerodos));

    }
}