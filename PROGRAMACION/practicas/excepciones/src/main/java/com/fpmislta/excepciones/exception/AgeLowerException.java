package com.fpmislta.excepciones.exception;

public class AgeLowerException extends Exception{
    private String message = "Tienes que ser mayor de edad para pasar";

    public String getMessage(){

        try {

        }catch (Exception e){
            throw new RuntimeException();
        }
        return message;
    }
}
