import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Ejercicio4 {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       int number;
       Set <Integer> pairnumber= new HashSet <>(); 
       Set <Integer> oddnumber= new HashSet <>(); 

       do{

        System.out.print("Introduce un numero o escribe 0 para salir: ");
        number = scanner.nextInt();
        if (pairnumber.contains(number) || oddnumber.contains(number)) {
            System.out.println("El numero esta repetido");
        } else {
            if ((number % 2) == 0) {
                pairnumber.add(number);
            } else {
                oddnumber.add(number);
            }
           
        }
        
        

       } while (number != 0);
       pairnumber.remove(0);
       oddnumber.remove(0);
       
       System.out.println (pairnumber);
       System.out.println (oddnumber);
    }
}