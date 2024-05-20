package org.example;


public interface NotificationService {
    /**
     * Notify the change of the account holder name of a bank account
     * @param bankAccount the bank account
     */
    void notifyUpdateAccountHolderChange(BankAccount bankAccount);
}
