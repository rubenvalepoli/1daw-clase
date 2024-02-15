package ud5.practices.bank;

public class BankAccount {


    private int accountNumber;
    private String titularName;
    private int balance;


    public BankAccount(int accountNumber, String titularName){
        this.accountNumber = accountNumber;
        this.titularName = titularName;
    }

    public BankAccount(int accountNumber, String titularName, int initalMoney){
        this.accountNumber = accountNumber;
        this.titularName = titularName;
        this.balance = initalMoney;
    }

    public boolean deposit(int amount){
        if (amount <= 0){
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount){
        if ((balance < amount) || (amount<=0)){
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transfer(int amount, BankAccount b1, BankAccount b2){
        if ((amount<=0) || (amount>b1.balance)){
            return false;
        }
        b1.withdraw(amount);
        b2.deposit(amount);
        return true;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTitularName() {
        return titularName;
    }

    public int getBalance() {
        return balance;
    }
}
