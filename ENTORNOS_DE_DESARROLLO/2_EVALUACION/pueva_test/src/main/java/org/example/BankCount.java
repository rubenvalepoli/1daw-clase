package org.example;

public class BankCount {

    public int deposit;




    public static void main(String[] args) {

        int deposit = 50;
        int remove= 20;

        int result;
        result = deposit - remove;
        System.out.println(result);

    }
    public BankCount(int deposit){
        this.deposit=deposit;
    }


    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void deposit(int deposit) {
    }


    public void add(int add) {
        deposit += add;
    }

    public boolean remove(int remove, int deposit) {
        if (deposit < remove){
            return false;
        } else if (getDeposit() >= remove) {
            deposit -= remove;

        }
        return true;
    }

    public boolean cuenta1Mayor(int cuenta1, int cuenta2) {
        if (cuenta1 < cuenta2){
            return false;
        }
        return true;
    }
/*
    public int cuenta1 = 70;
    public int cuenta2 = 100;

    public boolean masDinero(int cuenta1, int cuenta2){
        if (cuenta1 > cuenta2){
            System.out.println("cuenta1 es mas rico");
            return true;
        }
        System.out.println("Cuenta1 es mas pobre");

            return false;


    }*/
}
