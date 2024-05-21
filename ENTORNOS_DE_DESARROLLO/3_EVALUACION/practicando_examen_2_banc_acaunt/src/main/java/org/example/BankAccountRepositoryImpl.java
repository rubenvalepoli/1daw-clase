package org.example;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    private final BankAccountDao bankAccountDao;

    public BankAccountRepositoryImpl(BankAccountDao bankAccountDao) {
        this.bankAccountDao = bankAccountDao;
    }


    @Override
    public List<BankAccount> getAll() {
        return this.bankAccountDao.getAll();
    }

    @Override
    public BankAccount getBankAccountByNumber(String accountNumber) {
        if (bankAccountDao == null){
            return null;
        }
        return this.bankAccountDao.getBankAccountByNumber(accountNumber);
    }

    @Override
    public void updateAccountHolder(BankAccount bankAccount) {
        bankAccountDao.updateAccountHolder(bankAccount);
    }
}
