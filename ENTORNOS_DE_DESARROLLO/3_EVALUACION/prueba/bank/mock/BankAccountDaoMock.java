package ud5.practices.bank.mock;

import ud5.practices.bank.BankAccount;
import ud5.practices.bank.BankAccountDao;

import java.util.List;

public class BankAccountDaoMock implements BankAccountDao {

    List<BankAccount> bankAccountList = List.of(
            new BankAccount("123mr13","jorge",178.9),
            new BankAccount("1059kp","lucia",275.5),
            new BankAccount("3ws8n","marcos",341.4),
            new BankAccount("r23mr12","carla",287.1)
    );

    @Override
    public List<BankAccount> getAll() {
        return bankAccountList;
    }

    @Override
    public BankAccount getBankAccountByNumber(String accountNumber) {
        for (BankAccount bankAccount:bankAccountList){
            if (bankAccount.getNumAccount().equals(accountNumber)){
                return bankAccount;
            }
        }
        return null;
    }

    @Override
    public void updateAccountHolder(BankAccount bankAccount) {
        for (BankAccount bankAccount1:bankAccountList){
            if (bankAccount1.getNumAccount().equals(bankAccount.getNumAccount())){
                bankAccount1.setName(bankAccount.getName());
            }
        }
    }
}
