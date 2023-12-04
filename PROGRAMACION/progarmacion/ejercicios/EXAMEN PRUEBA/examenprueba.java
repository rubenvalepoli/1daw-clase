import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class examenprueba{
    static Scanner scanner = new Scanner(System.in);
    static int optionShoeMenu;
    

    public static void main(String[] args) {

        do{
        showMenu();

        } while (optionShoeMenu != 0);

    }

    public static void showMenu() {
        System.out.println("");
        System.out.println("MENU");
        System.out.println("------------");
        System.out.println("0. Salir");
        System.out.println("1. Mostrar números pares hasta el 100");
        System.out.println("2. Mostrar números pares hasta un número introducido por el usuario");
        System.out.println("3. Listar mayores de edad");
        System.out.println("4. Matriz");
        System.out.println("5. Cifrar texto");
        System.out.println("6. Superhéroes");
        System.out.print("Opción: ");
        optionShoeMenu = scanner.nextInt();
        scanner.nextLine();
        ejecuta();    
    }

    public static void ejecuta() {
        switch (optionShoeMenu) {
            case 0: 
                break;
            case 1:
            case 2:
                muestrapares();
                break;
            case 3:
                mayordeedad();
                break;
            case 4:
                 crearMatriz();
                break;
            case 5:
                cifradocesar();
                break;
            case 6:
                superheroes();
                break;
        
            default:
                break;
        }
    }

    public static void muestrapares() {
        int numerosparaes = 1;

        if (optionShoeMenu == 1) {
            
            while (numerosparaes <= 100) {
                if (numerosparaes % 2 == 0) {
                System.out.print(numerosparaes + " ");
                }
                numerosparaes ++;
            }

        } else if (optionShoeMenu == 2) {
            int numeropar;

            System.out.print("Hasta que numero quieres mostrar: ");
            numeropar=scanner.nextInt();

                while (numerosparaes <= numeropar) {
                    if (numerosparaes % 2 == 0) {
                    System.out.print(numerosparaes + " ");
                    }
                    numerosparaes ++;
                }
        }
    }

    public static void mayordeedad (){

        Map <String, Integer> diccionario = new HashMap<String, Integer>();
        int value;
        

        diccionario.put("Ruben", 17);
        diccionario.put("Sole", 21);
        diccionario.put("Aroa", 18);
        diccionario.put("Hector", 10);

        for (String key : diccionario.keySet()){
            value = diccionario.get(key);
            if (value >= 18) {
                System.out.print(key + " ");
            }
            
        }
    }


    public static void crearMatriz () {
        int [][] matriz = new int [6][6];
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++){
            matriz[i][i] = 1;
            for (int j = 0; j < matriz[i].length; j++){
                if (i < j){
                    matriz[i][j] = aleatorio.nextInt(0, 4) * 2 + 2;
                } else if (i > j) {
                    matriz[i][j] = aleatorio.nextInt(0,4) * 2 + 3;
                }                
            }
        }
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz (int[][] matriz){
        for (int[] row : matriz) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }


    public static void cifradocesar(){
        String palabra;
        int a = 0;
        char caracter;
        String abecedario = "abcdefghijklmnopqrstuvwxyzabc";

        System.out.println("Escribe la palabra que quieres cifrar: ");
        palabra = scanner.nextLine();
        while (a <palabra.length()) {
            caracter = palabra.charAt(0 + a);
            int b = abecedario.indexOf(caracter);
            System.out.print(abecedario.charAt(b + 3));
            a++;
        }
        System.out.println("");
    }



    public static void superheroes () {
            List<String> aliado = new ArrayList<String>();
            List<String> enemigo = new ArrayList<String>();        
        int opcionsuperheroes = 1;

        do {
            System.out.println("1.-Aliado");
            System.out.println("2.-Enemigo");
            System.out.println("0.-Salir");
            System.out.print("Opcion:");
            opcionsuperheroes = scanner.nextInt();
            scanner.nextLine();


            if (opcionsuperheroes == 1) {

                System.out.print("Pon un nombre para el aliado: ");
                String aliados = scanner.nextLine();
                aliado.add(aliados);

            }   else if (opcionsuperheroes == 2) {

                System.out.print("Pon un nombre de enemigo: ");
                String enemigos = scanner.nextLine();
                enemigo.add(enemigos);  
                
            }   else if (opcionsuperheroes == 0) {

               System.out.println("Aliado: " + aliado);
               System.out.println("Enemigo: " + enemigo);

            }   else {
                System.out.println("numero no valido");
            }
            
            

        } while (opcionsuperheroes != 0);

    }

}