import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class examenprueba{
    static Scanner Reader = new Scanner(System.in);    
    static int opcionmenu;
    static int[][] matriz = new int[6][6];

    public static void main(String[] args) {
        showMenu();

    }



    public static void showMenu(){

        System.out.println("------MENU------");
        System.out.println("1. Mostrar numeros pares hasta el 100");
        System.out.println("2. Mostrar numeros pares hasta un número introducido por el usuario");
        System.out.println("3. Listar mayores de edad");
        System.out.println("4. Matriz");
        System.out.println("5. Cifrar texto");
        System.out.println("6. Superheroes");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        opcionmenu = Reader.nextInt();
        ejecutar();
    }

    public static void ejecutar (){
        switch (opcionmenu) {
            case 0:
                break;
            case 1:
            case 2:
                muestrapares();
            case 3:
                edad();
            case 4:
                muestraMatriz();
            case 5:
                cifrado();
            case 6:

  
            default:
                break;
        }
    }

    public static void muestrapares() {;
        int numerosparaes = 0;
    
        if (opcionmenu == 1) {

            while (numerosparaes <= 100) {
                if (numerosparaes % 2 == 0 ){
                    System.out.println(numerosparaes);
                }
                numerosparaes ++;
            }
            
            }else if (opcionmenu == 2) {
                System.out.print("Numero limite: ");
                int numlimite = Reader.nextInt();

            while (numerosparaes <= numlimite) {
                if (numerosparaes % 2 == 0 ){
                    System.out.println(numerosparaes);
                }
                numerosparaes ++;
            }
        }
    }


    public static void edad() {

        Map<String, Integer> edadMap = new HashMap<String, Integer>();
            int valor;
            
            edadMap.put("Pepe Perez", 18); 
            edadMap.put("Juan Davila", 15); 
            edadMap.put("David Ortega", 30);
            edadMap.put("Ruben Valero", 17); 
            
            for (String clave : edadMap.keySet()) { 
                valor = edadMap.get(clave);
                if (valor >= 18) {
                    System.out.println(clave);
                }
                
            }        
    }

    public static void crearMatriz() {

       for (int i = 0; i < matriz.length; i++){
        matriz[i][i]=1;
       }
       Random random = new Random();
       for (int i = 0; i < matriz.length; i++){
       matriz[i][i + 1] =(random.nextInt(5) +1) * 2;
        }

        for (int i = 0; i < matriz.length; i++){
       matriz[i][i - 1] =(random.nextInt(4) + 2)* 2 - 1;
        }
        
        //cuando i es mayor que j estoy en el triangulo superior y cuado j es mayor que i estoy en el triangulo de abajo y si no esty en el medio
    }

    public static void muestraMatriz() {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void cifrado() {
        Scanner scanner = new Scanner(System.in);
        int posicion = -1;
        char letra;
        String valorBuscado;
        
        char[] abecedario = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b'};

        char[] abecedariobien = { 'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        System.out.print("Pon una frase para cifrar: ");
        String frasesincifrar = scanner.nextLine();
        // System.out.println("Has ingresado la siguiente frase: " + frasesincifrar);
        // scanner.close();

        for (int i = 0; i < frasesincifrar.length(); i++ ){

           letra = frasesincifrar.charAt(i);

            System.out.println(letra);

                    for (int j = 0; j < abecedario.length; j++){
            if (abecedario[j] == letra) {

                posicion = i;
                System.out.println("El valor " + letra + " se encuentra en la posición " + posicion + " del char array.");
            
            }
        }
        }
        






        
    }
}




