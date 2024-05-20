package org.example;

public class InvalidAccountHolderNameException extends Exception {
    public InvalidAccountHolderNameException(String message){
        super(message);
    }
}