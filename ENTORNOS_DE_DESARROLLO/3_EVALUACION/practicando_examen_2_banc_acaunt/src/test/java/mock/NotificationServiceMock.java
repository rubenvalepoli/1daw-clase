package mock;

import org.example.BankAccount;
import org.example.NotificationService;

public class NotificationServiceMock implements NotificationService {
    @Override
    public void notifyUpdateAccountHolderChange(BankAccount bankAccount) {
        System.out.println("Algo");
    }
}
