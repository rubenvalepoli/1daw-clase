import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args)
    {
        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        double base;
        float exponente;
        System.out.println("Introduce la base");
        base = reader.nextInt();
        System.out.println("Introduce el exponente");
        exponente = reader.nextInt();
        double resultado;

        resultado = Math.pow(base, exponente);
        String resultadofor = String.format("%.2f", resultado);
        System.out.println("El resultado de " + base + " elevado a la potencia " + exponente + " es: " + resultadofor);
    }
}