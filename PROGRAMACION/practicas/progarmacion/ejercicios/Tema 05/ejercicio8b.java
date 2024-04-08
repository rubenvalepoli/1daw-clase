import java.util.Scanner;
public class ejercicio8b {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int numero;
        int multiplicacion;
        int factor;
        int suma;
        int index;
        index = 1;
        factor = 2;
        suma = 1;
        System.out.print("Escribe un numero : ");
        numero = reader.nextInt();

        while (index<=10){
            multiplicacion = (numero * index);
            System.out.println(numero + " x " + index + " = " + multiplicacion);
            index++;
            while (factor<=multiplicacion){
            suma += factor;
            factor++;
            }
            System.out.println("Sumatorio = " + suma);
        }

    }

}
