import java.util.Scanner;
public class ejercicio4b {

    public static void main(String[] args){

        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        String color;
        String colorplano;
        System.out.print("Introduce un color : ");
        color = reader.nextLine();
        colorplano = color.toLowerCase();


        switch (colorplano) {
            case "rojo" -> System.out.println("Color de la sangre");
            case "azul" -> System.out.println("Color del cielo");
            case "amarillo" -> System.out.println("Color del sol");
            default -> System.out.println("Lo siento, ese color es muy aburrido");


        }

    }

}