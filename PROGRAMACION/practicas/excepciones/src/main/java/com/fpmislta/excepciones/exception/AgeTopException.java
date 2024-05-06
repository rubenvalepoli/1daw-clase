package com.fpmislta.excepciones.exception;

public class AgeTopException extends Exception{

    private String message = "Tienes que tener menos de 65 años para pasar";


    public String getMessage(){

        try {

        }catch (Exception e){
            throw new RuntimeException();
        }
        return message;
    }

}
