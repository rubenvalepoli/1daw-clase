package ud5.practices.bank.mock;

import ud5.practices.bank.BankAccount;
import ud5.practices.bank.NotificationService;

public class NotificationServiceMock implements NotificationService {
    @Override
    public void notifyUpdateAccountHolderChange(BankAccount bankAccount) {
        System.out.println("El nombre del account holder a cambiado a: "+ bankAccount.getName());
    }
}
