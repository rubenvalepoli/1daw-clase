import java.util.Scanner;
public class ejercicio6c {

        public static void main(String[] args){
            Scanner reader = new Scanner(System.in);
            int numero;
            System.out.print("Escribe un numero : ");
            numero = reader.nextInt();

            for(int index=1; index<=numero; index++){
                if ((index%2)!=0){
                  continue;
                }
                System.out.println(index);
            }

        }
}