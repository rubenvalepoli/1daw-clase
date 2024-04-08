import java.util.Scanner;
public class ejercicio1c {

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
        double suma = numerouno + numerodos;
        String sumares = String.format("%.2f", suma);
        System.out.println("La suma de los dos numeros es: " + sumares);
        double resta = numerouno - numerodos;
        String restares = String.format("%.2f", resta);
        System.out.println("La resta de los dos numeros es: " + restares);
        double multiplicacion = numerouno * numerodos;
        String multiplicacionres = String.format("%.2f", multiplicacion);
        System.out.println("La multiplicacion de los dos numeros es: " + multiplicacionres);
        double division = numerouno / numerodos;
        String divisionres = String.format("%.2f", division);
        System.out.println("La division de los dos numeros es: " + divisionres);
        double resto = numerouno % numerodos;
        String restores = String.format("%.2f", resto);
        System.out.println("La resto de los dos numeros es: " + restores);

    }
}