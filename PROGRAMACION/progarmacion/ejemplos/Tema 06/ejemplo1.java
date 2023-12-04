import java.util.Scanner;
public class ejemplo1 {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        float edad;
        System.out.print("Introduce la edad: ");
        edad = reader.nextInt();
        if (edad < 18){
            System.out.println("No puedes pasar");
        } else {
            System.out.println("Puedes pasar");
        }
    }

}