package org.example;

import mock.BanckAccountRepositoryMock;
import mock.NotificationServiceMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)


class BankAccountServiceImplTest {

    @Mock
    private BankAccountRepository bankAccountRepositoryMock;
    @Mock
    private NotificationService notificationServiceMock;

    @InjectMocks
    private BankAccountServiceImpl bankAccountService;


    BankAccount bankAccount1= new BankAccount("1","Ruben",100);
    BankAccount bankAccount2= new BankAccount("2","Isabel",200);
    BankAccount bankAccount3= new BankAccount("3","Pepa",300);
    BankAccount bankAccount4= new BankAccount("4","So",400);
   List<BankAccount> bankAccountList = List.of(
            bankAccount1, bankAccount2,bankAccount3,bankAccount4
    );


    @Nested
    public class NestedGetAll{

       @Test
        @DisplayName("return all accounts")
        void returnAllAccounts(){
           when(bankAccountRepositoryMock.getAll()).thenReturn(bankAccountList);
           assertEquals(bankAccountRepositoryMock.getAll(),bankAccountService.getAll());
        }

    }


    @Nested
    public class NestedGetBankAccountByNumber{

        @Test
        @DisplayName("account number doesen't exist")
        void acountNumberNotExits(){
            when(bankAccountRepositoryMock.getBankAccountByNumber("123mr13")).thenReturn(null);
            assertThrows(BankAccountNotFoundException.class, () -> bankAccountService.getBankAccountByNumber("123mr13"));
        }

        @Test
        @DisplayName("account number exist")
        void acountNumberExits() throws BankAccountNotFoundException {
            when(bankAccountRepositoryMock.getBankAccountByNumber("1")).thenReturn(bankAccount1);
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
        @DisplayName("function update holder name")
        void accountHolderGetNotification() throws InvalidAccountHolderNameException {
            bankAccountService.updateAccountHolder(bankAccount1,"Pepe");
            assertEquals("Pepe", bankAccount1.getAccountHolder());
            verify(notificationServiceMock).notifyUpdateAccountHolderChange(bankAccount1);
            verify(bankAccountRepositoryMock).updateAccountHolder(bankAccount1);
        }
    }

}