package org.example.front;

import java.util.Scanner;

public class App {

    public static int option;
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        App request = new App();



            do {
                menu.show();
                option = scanner.nextInt();
                request.request();
            } while (option != 0);
    }



    public void request(){


        System.out.println("Haciendo peticion al servidor...");
        org.example.back.App.response(option);

        //FALTA QUE VALLA EL LISTADO DE CLIENTES EJERCICIO 4 TEMA 11


    }



}
