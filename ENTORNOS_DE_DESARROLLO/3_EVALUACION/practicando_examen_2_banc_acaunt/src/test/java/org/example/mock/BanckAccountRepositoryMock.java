package org.example.mock;

import org.example.BankAccount;
import org.example.BankAccountRepository;

import java.util.List;

public class BanckAccountRepositoryMock implements BankAccountRepository {

    List<BankAccount> bankAccountList = List.of(
            new BankAccount("123mr13","Pepe",178.9),
            new BankAccount("1059kp","lucia",275.5),
            new BankAccount("3ws8n","marcos",341.4),
            new BankAccount("r23mr12","carla",287.1)
    );
    @Override
    public List<BankAccount> getAll() {
        return bankAccountList;
    }

    @Override
    public BankAccount getBankAccountByNumber(String accontNumber) {
        for (BankAccount bankAccount : bankAccountList){
            if (accontNumber.equals(bankAccount.getAccountNumber())){
                return bankAccount;
            }
        }
        return null;
    }

    @Override
    public void updateAccountHolder(BankAccount bankAccount) {
    }
}
