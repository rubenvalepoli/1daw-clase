package org.example;

public class BankAccountNotFoundException extends Exception {
    public BankAccountNotFoundException(String message){
        super(message);
    }
}