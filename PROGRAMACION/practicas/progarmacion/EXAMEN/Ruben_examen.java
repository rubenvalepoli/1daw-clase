import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;


public class Ruben_examen {
    static Scanner scanner = new Scanner(System.in);
    static int menuoption;
 
    public static void main(String[] args) throws IOException {

        int loopexit = 1;

        do {
            showMenu();
            menuoption = scanner.nextInt();
            System.out.println("La opcion introducida es: " + menuoption);
            executeOption();
            
        } while (menuoption != 0);
        

        
    }


    public static void showMenu() {
        System.out.println("");
        System.out.println("MENU");
        System.out.println("-----------");
        System.out.println("1. Mostrar números primos hasta el 100");
        System.out.println("2. Contar una letra en una frase");
        System.out.println("3. Dibujar cara");
        System.out.println("4. Palabras B/V");
        System.out.println("5. Contar herramientas");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }


    public static void executeOption() throws IOException {
        
        switch (menuoption) {
            case 0:
                    System.out.println("Opcion 0");
                break;
            case 1:

                int max = 100;
        
                for(int prime = 2; prime <= max; prime++){
                    if(primeNumber(prime)){
                        System.out.print( prime +" ");
                    }
                }
                    
                break;
            case 2:
                    frase();
                break;
            case 3:
                    
                    System.out.println("Selecciona una opcion" + "(1 - contento 2 - triste)");
                    int hapysad = scanner.nextInt();

                    if (hapysad == 1) {

                        happy();

                    } else if (hapysad == 2){

                        sad();
                        
                    } else {
                        System.out.println("error");
                    }


                break;
            case 4:
                    /* DA ERROR PERO NO SE PORQUE */
                    String optionv ="v";
                    String optionb ="b";
                     List<String> v = new ArrayList<String>();
                     List<String> b = new ArrayList<String>(); 
                    System.out.println("Escribe palabras con B/V:");
                    String caracter = scanner.nextLine();

                    char firstcaracter = caracter.charAt(0);
                    System.out.println(firstcaracter);

                    if (firstcaracter == optionv.charAt(optionv.indexOf(firstcaracter))) {
                        
                        v.add(caracter);
                    } else if (firstcaracter == optionb.charAt(optionb.indexOf(firstcaracter))) {
                        
                        b.add(caracter);
                    }
 

                break;
            case 5:
                    maps();
                break;
        
            default:
                break;
        }

    }


    public static void frase() throws IOException {

        String texto;
        char caracter;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = scanner.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");                   
    }


                 
    


    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++;           
            
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }




    public static boolean primeNumber(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
                primo = false;
          contador++;
        }
        return primo;
    }


    public static void maps() {

        /* NO VA EL CODIGO */

       /*  String martillo = "martillo";

        String[] tools = {"martillo", "destornillador", "clavo", "martillo", "taladro", "martillo",
        "destornillador"};
        
        for (int elemento : tools) {
            System.out.println(elemento);    
        }
            

             Map<String, Integer> diccionario = new HashMap<String, Integer>();
            int value;

            diccionario.put("martillo", martillonumber);
            diccionario.put("destornillador", destornilladornumber);
            diccionario.put("clavo", clavonumber);
            diccionario.put("taladro", taladronumber);


            for (String key : diccionario.keySet()){

                value = diccionario.get(key);
                System.out.println(key + " : " + value);
            }  */
            
        

    }

    public static void happy() {

    int[][] tablero = {
            {2, 2, 2, 2, 2, 2},
            {2, 1, 2, 2, 1, 2},
            {2, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 2},
            {0, 2, 2, 2, 2, 0},
            {2, 0, 0, 0, 0, 2}       
        };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] == 1) {
                    System.out.print("O");
                } else if (tablero[i][j] == 0) {
                    System.out.print("x");
                    
                }else if (tablero[i][j] == 2) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void sad() {
        

    int[][] tablero = {
            {2, 2, 2, 2, 2, 2},
            {2, 1, 2, 2, 1, 2},
            {2, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 2},
            {2, 0, 0, 0, 0, 2},
            {0, 2, 2, 2, 2, 0}       
        };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] == 1) {
                    System.out.print("O");
                } else if (tablero[i][j] == 0) {
                    System.out.print("x");
                    
                }else if (tablero[i][j] == 2) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}