import java.util.Scanner;

public class ejecicio5{
    public static void main(String[] args) {
        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        int minimo;
        int maximo;
        System.out.println("Introduce el minimo");
        minimo = reader.nextInt();
        System.out.println("Introduce el maximo");
        maximo = reader.nextInt();

        int numero = (int) (Math.random() * (maximo - minimo)) + minimo;
        System.out.println(numero);


    }

}