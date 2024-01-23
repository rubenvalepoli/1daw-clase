package org.example.back;

import org.example.back.controller.CustemerController;

public class App {

    public static String response(int option){

        CustemerController controller = new CustemerController ();


        if (option == 1){

            return controller.findAll().toString();

        }else{
            return "404 .- Recurso no encontrado";
        }

    }

}
