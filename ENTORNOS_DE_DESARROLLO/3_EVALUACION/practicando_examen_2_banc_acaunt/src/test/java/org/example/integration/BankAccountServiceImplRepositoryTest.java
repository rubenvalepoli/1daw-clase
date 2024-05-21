package org.example.integration;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BankAccountServiceImplRepositoryTest {

    private final BankAccountDao bankAccountDaoMock = Mockito.mock(BankAccountDao.class);
    private final NotificationService notificationServiceMock = Mockito.mock(NotificationService.class);
    private final BankAccountRepository bankAccountRepository = new BankAccountRepositoryImpl(bankAccountDaoMock);
   private final BankAccountServiceImpl bankAccountService = new BankAccountServiceImpl(bankAccountRepository, notificationServiceMock);


    BankAccount bankAccount1= new BankAccount("1","Ruben",100);
    BankAccount bankAccount2= new BankAccount("2","Isabel",200);
    BankAccount bankAccount3= new BankAccount("3","Pepa",300);
    BankAccount bankAccount4= new BankAccount("4","So",400);

    List<BankAccount> bankAccountList = new ArrayList<>();


    @Nested
    public class NestedGetAll{

        @Test
        @DisplayName("return void list")
        void returnVoidList() {
            when(bankAccountDaoMock.getAll()).thenReturn(bankAccountList);
            assertEquals(bankAccountList, bankAccountService.getAll());
        }

        @Test
        @DisplayName("return all acounts")
        void returnAllAccounts(){
            bankAccountList.add(bankAccount2);
            bankAccountList.add(bankAccount3);
            bankAccountList.add(bankAccount1);
            bankAccountList.add(bankAccount4);

            when(bankAccountDaoMock.getAll()).thenReturn(bankAccountList);
            List<BankAccount> expectedList = List.of(bankAccount1,bankAccount2,bankAccount3,bankAccount4);
            assertEquals(expectedList,bankAccountService.getAll());
        }
    }

    @Nested
    public class NestedGetBankAccountByNumber{

        @Test
        @DisplayName("account number does not exist")
        void accountNumberNotExits(){
            when(bankAccountDaoMock.getBankAccountByNumber("123mr13")).thenReturn(null);
            assertThrows(BankAccountNotFoundException.class, () -> bankAccountService.getBankAccountByNumber("123mr13"));
        }

        @Test
        @DisplayName("account number exist")
        void acountNumberExits() throws BankAccountNotFoundException {
            when(bankAccountDaoMock.getBankAccountByNumber("1")).thenReturn(bankAccount1);
            assertEquals(bankAccount1, bankAccountService.getBankAccountByNumber("1"));
        }
    }

    @Nested
    public class NestedUpdateAccountHolder{


        @Test
        @DisplayName("Holder name must be long than 3 characters long")
        void accountHolderToSmall() throws InvalidAccountHolderNameException {

            assertThrows(InvalidAccountHolderNameException.class,() -> bankAccountService.updateAccountHolder(bankAccount4, "Pepe"));

        }


        @Test
        @DisplayName("account holder name is correctly changed")
        void accountHolderGetNotification() throws InvalidAccountHolderNameException {
            bankAccountService.updateAccountHolder(bankAccount1,"Pepe");
            assertEquals("Pepe", bankAccount1.getAccountHolder());
            verify(notificationServiceMock).notifyUpdateAccountHolderChange(bankAccount1);
            verify(bankAccountDaoMock).updateAccountHolder(bankAccount1);
        }
    }
}
