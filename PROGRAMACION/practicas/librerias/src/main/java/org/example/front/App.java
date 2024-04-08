package org.example.front;

import org.example.back.controller.CustemerController;
import org.example.back.domain.Customer;

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
                System.out.println(request(option));
            } while (option != 0);
    }



    public static String request(int option){



        System.out.println("Haciendo peticion al servidor...");

        return org.example.back.App.response(option);



        // FALTA EL EJERCICIO 6 "QUE ME DA PATEO"

    }



}
