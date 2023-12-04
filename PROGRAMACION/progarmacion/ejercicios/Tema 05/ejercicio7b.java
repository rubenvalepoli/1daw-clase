import java.util.Scanner;
public class ejercicio7b {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
        int index;
        boolean found = false;
        System.out.print("Escribe un numero : ");
        numero = reader.nextInt();
        index = numero +1;

        while (true){
            if((index%numero) == 0){
                break;
            }
            index++;
        }
        System.out.println(index);
    }
}