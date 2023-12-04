import java.util.Scanner;
public class ejercicio8a {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
        int multiplicacion;
        int index;
       numero = 2;
       index = 1;
       /* System.out.print("Escribe un numero : ");
        numero = reader.nextInt();
        index = numero +1;*/

        while (index<=10){
            multiplicacion = (numero * index);
            System.out.println(numero + " x " + index + " = " + multiplicacion);
            index++;
            }

        }

    }
