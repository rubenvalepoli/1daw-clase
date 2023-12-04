import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class ejercicio4d {
    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {

        int numero;
        Set<Integer> pares = new HashSet<>();
        Set<Integer> impares = new HashSet<>();


        System.out.print("Tamanyo del conjunto: ");
        do {
            System.out.print("Escribe un numero (0 para salir): ");
            numero = reader.nextInt();
            if(numero % 2 == 0){
                anyadeNumero(numero, pares);
            } else {
                anyadeNumero(numero, impares);
            }

        } while (numero != 0);
        pares.remove(0);
        impares.remove(0);
        System.out.println(pares);
        System.out.println(impares);
    }

    public static void anyadeNumero(int numero, Set<Integer> numeros){
        if (numeros.contains(numero)){
            System.out.println("El numero esta repetido y no se anyadira al conjunto");
        }else {
            numeros.add(numero);
        }

    }

}