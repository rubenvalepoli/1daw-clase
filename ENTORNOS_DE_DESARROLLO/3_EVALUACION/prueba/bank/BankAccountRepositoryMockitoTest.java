package ud5.practices.bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BankAccountRepositoryMockitoTest {
    @Mock
    private BankAccountDao bankAccountDaoMock;
    @InjectMocks
    private BankAccountRepositoryImpl bankAccountRepository;
    private List<BankAccount> bankAccountList = List.of(
            new BankAccount("123mr13","jorge",178.9),
            new BankAccount("1059kp","lucia",275.5),
            new BankAccount("3ws8n","marcos",341.4),
            new BankAccount("r23mr12","carla",287.1)
    );
    @Test
    @DisplayName("Get all the bankaccounts")
    void returnAllBankAccount(){
        when(bankAccountDaoMock.getAll()).thenReturn(bankAccountList);
        assertEquals(bankAccountList,bankAccountRepository.getAll());
    }
    @Test
    @DisplayName("When false account number return null")
    void returnNullForFalseNumber(){
        when(bankAccountDaoMock.getBankAccountByNumber("als21")).thenReturn(null);
        assertNull(bankAccountRepository.getBankAccountByNumber("als21"));
    }
    @Test
    @DisplayName("When true account number return bankAccount")
    void returnBankAccountForTrueNumber(){
        when(bankAccountDaoMock.getBankAccountByNumber("123mr13")).thenReturn(bankAccountList.get(0));
        assertEquals(bankAccountList.get(0),bankAccountRepository.getBankAccountByNumber("123mr13"));
    }
    @Test
    @DisplayName("Function calls dao implementation")
    void callDaoUpdateName(){
        bankAccountRepository.updateAccountHolder(bankAccountList.get(0));
        verify(bankAccountDaoMock).updateAccountHolder(bankAccountList.get(0));
    }
}
