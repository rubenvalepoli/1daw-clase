import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class ejercicio4a {
static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        int numero, tamanyoConjunto;
        Set<Integer> numeros = new HashSet<>();

        System.out.print("Tamanyo del conjunto: ");
        tamanyoConjunto = reader.nextInt();

        for(int i = 0; i < tamanyoConjunto; i++) {
        System.out.print("Pon un numero: ");
        numero =  reader.nextInt();
        numeros.add(numero);
        }
        System.out.println(numeros);
    }
}