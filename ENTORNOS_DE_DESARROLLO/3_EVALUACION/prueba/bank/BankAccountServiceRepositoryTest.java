package ud5.practices.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BankAccountServiceRepositoryTest {
    @Mock
    private BankAccountDao bankAccountDaoMock;
    @Mock
    private NotificationService notificationServiceMock;
    private BankAccountRepository bankAccountRepository;
    private BankAccountService bankAccountService;

    private List<BankAccount> bankAccountList = List.of(
            new BankAccount("123mr13","jorge",178.9),
            new BankAccount("1059kp","lucia",275.5),
            new BankAccount("3ws8n","marcos",341.4),
            new BankAccount("r23mr12","carla",287.1)
    );
    @BeforeEach
    void setUp(){
        bankAccountRepository = new BankAccountRepositoryImpl(bankAccountDaoMock);
        bankAccountService = new BankAccountServiceImpl(bankAccountRepository,notificationServiceMock);
    }
    @Test
    @DisplayName("Get all bankAccount")
    void returnAllBankAccount(){
        when(bankAccountDaoMock.getAll()).thenReturn(bankAccountList);
        assertEquals(bankAccountList,bankAccountService.getAll());
    }
    @Test
    @DisplayName("Throw exception with false account number")
    void throwExceptionForFalseNumber(){
        when(bankAccountDaoMock.getBankAccountByNumber("vfqw32")).thenReturn(null);
        assertThrows(BankAccountNotFoundException.class, () -> bankAccountService.getBankAccountByNumber("vfqw32"));
    }
    @Test
    @DisplayName("Return bankAccount with correct number")
    void returnBankAccount() throws BankAccountNotFoundException {
        when(bankAccountDaoMock.getBankAccountByNumber("123mr13")).thenReturn(bankAccountList.get(0));
        assertEquals(bankAccountList.get(0),bankAccountService.getBankAccountByNumber("123mr13"));
    }
    @Test
    @DisplayName("Name too short throw exception")
    void throwExceptionForShortName(){
        assertThrows(InvalidAccountHolderNameException.class,()->bankAccountService.updateAccountHolder(bankAccountList.get(0),"as"));
    }
    @Test
    @DisplayName("Correct name verify dao is called")
    void callDaoUpdateName() throws InvalidAccountHolderNameException {
        bankAccountService.updateAccountHolder(bankAccountList.get(0),"angela");
        verify(bankAccountDaoMock).updateAccountHolder(bankAccountList.get(0));
        verify(notificationServiceMock).notifyUpdateAccountHolderChange(bankAccountList.get(0));
    }
}
