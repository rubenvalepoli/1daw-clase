import java.util.Scanner;
public class ejercicio6a {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
        int index = 1;
        System.out.print("Escribe un numero : ");
        numero = reader.nextInt();

        do{
            if ((index%2)==0){
                System.out.print(index);
            }
            index++;
        }while (index<=numero);

    }
}