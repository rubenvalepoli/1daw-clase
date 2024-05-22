package ud5.practices.bank;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BankAccountServiceImplMockitoTest {
    @Mock
    private BankAccountRepository bankAccountRepositoryMock;
    @Mock
    private NotificationService notificationServiceMock;
    @InjectMocks
    private BankAccountServiceImpl bankAccountService;

    private List<BankAccount> bankAccountList = List.of(
            new BankAccount("123mr13","jorge",178.9),
            new BankAccount("1059kp","lucia",275.5),
            new BankAccount("3ws8n","marcos",341.4),
            new BankAccount("r23mr12","carla",287.1)
    );


    @Nested
    class FindAll{
        @Test
        @DisplayName("Return all accounts in list")
        void returnAllAccounts(){
            when(bankAccountRepositoryMock.getAll()).thenReturn(bankAccountList);
            assertEquals(bankAccountList,bankAccountService.getAll());
        }
    }

    @Nested
    class FindByAccountNumber{
        @Test
        @DisplayName("Account number does not exist throw exception")
        void falseAccountNumberThrowException(){
            when(bankAccountRepositoryMock.getBankAccountByNumber("vfqw32")).thenReturn(null);
            assertThrows(BankAccountNotFoundException.class, () -> bankAccountService.getBankAccountByNumber("vfqw32"));
        }

        @Test
        @DisplayName("Account number exists return banckaccount")
        void realAccountNumberReturnBankAccount() throws BankAccountNotFoundException {
            when(bankAccountRepositoryMock.getBankAccountByNumber("123mr13")).thenReturn(bankAccountList.get(0));
            assertEquals(bankAccountList.get(0),bankAccountService.getBankAccountByNumber("123mr13"));
        }
    }

    @Nested
    class UpdateAccountHolderName{
        @Test
        @DisplayName("Name too short throw exception")
        void shortNameThrowException() throws InvalidAccountHolderNameException {
            assertThrows(InvalidAccountHolderNameException.class,()->bankAccountService.updateAccountHolder(bankAccountList.get(0),"as"));
        }

        @Test
        @DisplayName("Name correct length modify repository")
        void correctNameModifyRepository() throws InvalidAccountHolderNameException {
            bankAccountService.updateAccountHolder(bankAccountList.get(1),"angela");
            verify(notificationServiceMock).notifyUpdateAccountHolderChange(bankAccountList.get(1));
            verify(bankAccountRepositoryMock).updateAccountHolder(bankAccountList.get(1));

        }

    }

}
