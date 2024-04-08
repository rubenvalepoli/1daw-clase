import java.util.Scanner;
public class ejercicio1c {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        float edad;
        String frase;
        System.out.print("Introduce la edad: ");
        edad = reader.nextInt();

        frase = (edad<18)? "No puedes pasar": "Puede pasar";

        System.out.println(frase);
    }

}