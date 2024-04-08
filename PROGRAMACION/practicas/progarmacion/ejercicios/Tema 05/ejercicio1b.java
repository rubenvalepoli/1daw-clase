import java.util.Scanner;
public class ejercicio1b {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        float edad;
        System.out.print("Introduce la edad: ");
        edad = reader.nextInt();
        if (edad < 18){
            System.out.println("No puedes pasar");
        }
        if (edad >= 18){
            System.out.println("Puedes pasar");
        }
    }

}