import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plantilla_examen {
    static Scanner scanner = new Scanner(System.in);
    static int menuoption;
 
    public static void main(String[] args) {

        int loopexit = 1;

        do {
            showMenu();
            menuoption = scanner.nextInt();
            System.out.println("La opcion introducida es: " + menuoption);
            executeOption();
            
        } while (menuoption != 0);
        

        
    }


    public static void showMenu() {
        
        System.out.println("MENU");
        System.out.println("-----------");
        System.out.println("1. Mostrar números primos hasta el 100");
        System.out.println("2. Contar una letra en una frase");
        System.out.println("3. . Dibujar cara");
        System.out.println("4. Palabras B/V");
        System.out.println("5. Contar herramientas");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }


    public static void executeOption() {
        
        switch (menuoption) {
            case 0:
                    System.out.println("Opcion 0");
                break;
            case 1:
                    
                    System.out.println("Opcion 1");
                break;
            case 2:
                    
                    System.out.println("Opcion 2");
                break;
            case 3:
                    maps();
                    System.out.println("Opcion 3");
                break;
            case 4:
                    System.out.println("Opcion 4");
                break;
            case 5:
                    System.out.println("Opcion 5");
                break;
        
            default:
                break;
        }

    }




    public static void pares() {
        
    }


    public static void maps() {

        Map<String, Integer> diccionario = new HashMap<String, Integer>();
        int value;

        diccionario.put("Edad", 18);
        diccionario.put("año", 2023);
        diccionario.put("edad", 34);

        for (String key : diccionario.keySet()){

            value = diccionario.get(key);
            System.out.println(key + " : " + value);
        }
        
    }

}