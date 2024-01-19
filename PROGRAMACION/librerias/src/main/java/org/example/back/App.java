package org.example.back;

import org.example.back.controller.CustemerController;

public class App {

    public static void response(int option){

        CustemerController controller = new CustemerController ();

        if (option == 1){

            controller.findAll();

        }else{
            System.out.println("404 .- Recurso no encontrado");
        };


        System.out.println("Respuesta del servidor...");
    }

}
