import java.util.Scanner;
public class ejercicio7a {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
//        int index;
//        boolean found = false;
        System.out.print("Escribe un numero : ");
        numero = reader.nextInt();

        int multiplo = (numero * 2);
        System.out.println(multiplo);
        /*index = numero +1;

        while (!found){
            if((index%numero) == 0){
                found = true;
            }
            index++;
        }
        System.out.println(index-1);*/
    }
}