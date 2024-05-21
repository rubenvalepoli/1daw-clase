package org.example;

import java.util.List;

public interface BankAccountDao {
    public List<BankAccount> getAll();
    public BankAccount getBankAccountByNumber(String accountNumber);
    public void updateAccountHolder(BankAccount bankAccount);
}
