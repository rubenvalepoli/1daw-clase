package org.example;

public class BankCount {

    int num;
    String name;
    int saldo;



    public BankCount(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public BankCount(int num, String name, int saldo) {
        this.num = num;
        this.name = name;
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean deposit(int ingreso) {

        return true;
    }
}
