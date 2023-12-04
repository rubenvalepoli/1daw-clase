import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class practica3ruben{

    static Scanner Reader = new Scanner(System.in);    
    static int numBarcos = 6;
    static int sizeTablero = 8;
    static int[][] tablero = new int[8][8];
    static int opcion = 0;
    static int atacarFila;
    static int atacarColuma;
    static int barcosencontrados;
    static int numdisparos = 12;

    public static void main( String[] args){

        int cerrarbucle;

        System.out.println("Instruciones Juego:");
        System.out.println("( ) no has elegido la casilla");
        System.out.println("(0) no hay barco");
        System.out.println("(x)has hundido el barco");
        System.out.println("----------------------------------------------");

        positionBoats();

        while ( opcion == 0) {
            
            printTablero();
            System.out.println("Numero de disparos disponible = " + numdisparos);
            System.out.print("Escribe una columa para atacar: ");
            atacarColuma = Reader.nextInt();

            System.out.print("Escribe una fila para atacar: ");
            atacarFila = Reader.nextInt();

            atacarColuma = atacarColuma -1;
            atacarFila = atacarFila -1;

            if (atacarColuma > 7 || atacarFila > 7 || atacarColuma < 0 || atacarFila < 0) {
                System.out.println("Opcion incorrecta");
                continue;              

            }

            
            if ( tablero[atacarColuma][atacarFila] == 0){
                tablero[atacarColuma][atacarFila] = 2;
            } else if (tablero[atacarColuma][atacarFila] == 1) {
                tablero[atacarColuma][atacarFila] = 3;
                barcosencontrados = barcosencontrados +1;
            } else if (tablero[atacarColuma][atacarFila] == 2 || tablero[atacarColuma][atacarFila] == 3) {
                System.out.println("Error, No puedes elegir una casilla abierta");
            }

            numdisparos = numdisparos -1;


            printTablero();

            if (numdisparos == 0) {
                System.out.println("Se te han acabado los disparos");
                break;
            }

            if (barcosencontrados == 6) {
                System.out.println("Has encontrado todos los barcos, Fin");
                break;
            }

            System.out.print("Pon un 0 si queres cerrar el progrma y otro num para seguir ");
            cerrarbucle = Reader.nextInt();
            if (cerrarbucle == 0) {
                
                opcion = 1;
                break;
            } else {
                opcion = 0;
            }
            System.out.println("Se ha terminado el programa: ");

        } 
    }



    public static void positionBoats(){

        Random random = new Random();
    
        while (numBarcos > 0){
            int row = random.nextInt(sizeTablero - 1);
            int column = random.nextInt(sizeTablero - 1);
            if (tablero[row][column] == 0) {
                tablero[row][column] = 1;
                numBarcos = numBarcos - 1; 
                }
            }    
        }
        public static void printTablero (){
             for (int i = 0; i < tablero.length; ++i){
                for (int j = 0; j < tablero[i].length; ++j){
                    if (tablero[i][j] == 0 || tablero[i][j] ==1) {
                        System.out.print("( )" + " ");                        
                    } else if (tablero[i][j] == 2) {
                        System.out.print("(0)" + " ");
                    }else if (tablero[i][j] == 3) {
                        System.out.print("(x)" + " ");
                    }
                }
                System.out.println();
            }
        }

    } 

