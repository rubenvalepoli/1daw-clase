package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public final class BankAccountServiceImplTest {
    ///region Test suites for executable org.example.BankAccountServiceImpl.getAll

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAll()

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#getAll()}
     * @utbot.throwsException {@link NullPointerException} in: List<BankAccount> bankAccounts = bankAccountRepository.getAll();
     */
    @Test
    @DisplayName("getAll: bankAccounts = bankAccountRepository.getAll() : True -> ThrowNullPointerException")
    public void testGetAll_ThrowNullPointerException() {
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, null);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.getAll] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.getAll(BankAccountServiceImpl.java:17) */
        bankAccountServiceImpl.getAll();
    }

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#getAll()}
     * @utbot.invokes {@link java.util.Comparator#comparing(java.util.function.Function)}
     * @utbot.throwsException {@link NullPointerException} in: bankAccounts.sort(Comparator.comparing(BankAccount::getAccountNumber));
     */
    @Test
    @DisplayName("getAll: bankAccounts.sort(Comparator.comparing(BankAccount::getAccountNumber)) : True -> ThrowNullPointerException")
    public void testGetAll_ThrowNullPointerException_1() {
        BankAccountRepository bankAccountRepositoryMock = mock(BankAccountRepository.class);
        (when(bankAccountRepositoryMock.getAll())).thenReturn(((List) null));
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(bankAccountRepositoryMock, null);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.getAll] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.getAll(BankAccountServiceImpl.java:18) */
        bankAccountServiceImpl.getAll();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable org.example.BankAccountServiceImpl.getBankAccountByNumber

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBankAccountByNumber(java.lang.String)

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#getBankAccountByNumber(String)}
     * @utbot.executesCondition {@code (bankAccount == null): False}
     * @utbot.invokes {@link BankAccountRepository#getBankAccountByNumber(String)}
     * @utbot.returnsFrom {@code return bankAccount;}
     */
    @Test
    @DisplayName("getBankAccountByNumber: BankAccountRepositoryGetBankAccountByNumber -> return bankAccount")
    public void testGetBankAccountByNumber_BankAccountNotEqualsNull() throws BankAccountNotFoundException {
        BankAccountRepository bankAccountRepositoryMock = mock(BankAccountRepository.class);
        BankAccount bankAccount = new BankAccount(null, null);
        (when(bankAccountRepositoryMock.getBankAccountByNumber(any()))).thenReturn(bankAccount);
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(bankAccountRepositoryMock, null);

        BankAccount actual = bankAccountServiceImpl.getBankAccountByNumber(null);

        String actualAccountNumber = actual.getAccountNumber();
        assertNull(actualAccountNumber);

        String actualAccountHolder = actual.getAccountHolder();
        assertNull(actualAccountHolder);

        double bankAccountBalance = bankAccount.getBalance();
        double actualBalance = actual.getBalance();
        assertEquals(bankAccountBalance, actualBalance, 1.0E-6);

    }
    ///endregion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBankAccountByNumber(java.lang.String)

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#getBankAccountByNumber(String)}
     * @utbot.invokes {@link BankAccountRepository#getBankAccountByNumber(String)}
     * @utbot.throwsException {@link NullPointerException} in: BankAccount bankAccount = bankAccountRepository.getBankAccountByNumber(accountNumber);
     */
    @Test
    @DisplayName("getBankAccountByNumber: bankAccount = bankAccountRepository.getBankAccountByNumber(accountNumber) : True -> ThrowNullPointerException")
    public void testGetBankAccountByNumber_ThrowNullPointerException() throws BankAccountNotFoundException {
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, null);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.getBankAccountByNumber] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.getBankAccountByNumber(BankAccountServiceImpl.java:23) */
        bankAccountServiceImpl.getBankAccountByNumber(null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getBankAccountByNumber(java.lang.String)

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#getBankAccountByNumber(String)}
     * @utbot.executesCondition {@code (bankAccount == null): True}
     * @utbot.invokes {@link BankAccountRepository#getBankAccountByNumber(String)}
     * @utbot.throwsException {@link BankAccountNotFoundException} when: bankAccount == null
     */
    @Test
    @DisplayName("getBankAccountByNumber: bankAccount == null -> ThrowBankAccountNotFoundException")
    public void testGetBankAccountByNumber_ThrowBankAccountNotFoundException() {
        BankAccountRepository bankAccountRepositoryMock = mock(BankAccountRepository.class);
        (when(bankAccountRepositoryMock.getBankAccountByNumber(any()))).thenReturn(((BankAccount) null));
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(bankAccountRepositoryMock, null);

        assertThrows(BankAccountNotFoundException.class, () -> bankAccountServiceImpl.getBankAccountByNumber(null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable org.example.BankAccountServiceImpl.updateAccountHolder

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateAccountHolder(org.example.BankAccount, java.lang.String)

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#updateAccountHolder(BankAccount, String)}
     * @utbot.executesCondition {@code (bankAccount.getAccountHolder().length() < 3): False}
     * @utbot.invokes {@link BankAccount#getAccountHolder()}
     * @utbot.invokes {@link String#length()}
     * @utbot.invokes {@link BankAccount#setAccountHolder(String)}
     * @utbot.invokes {@link NotificationService#notifyUpdateAccountHolderChange(BankAccount)}
     * @utbot.invokes {@link BankAccountRepository#updateAccountHolder(BankAccount)}
     */
    @Test
    @DisplayName("updateAccountHolder: BankAccountGetAccountHolder -> BankAccountRepositoryUpdateAccountHolder")
    public void testUpdateAccountHolder_BankAccountGetAccountHolderLengthGreaterOrEqual3() throws InvalidAccountHolderNameException {
        BankAccountRepository bankAccountRepositoryMock = mock(BankAccountRepository.class);
        (((BankAccountRepository) (doNothing()).when(bankAccountRepositoryMock))).updateAccountHolder(any());
        NotificationService notificationServiceMock = mock(NotificationService.class);
        (((NotificationService) (doNothing()).when(notificationServiceMock))).notifyUpdateAccountHolderChange(any());
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(bankAccountRepositoryMock, notificationServiceMock);
        String string = "   ";
        BankAccount bankAccount = new BankAccount(null, string, 0.0);

        bankAccountServiceImpl.updateAccountHolder(bankAccount, null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateAccountHolder(org.example.BankAccount, java.lang.String)

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#updateAccountHolder(BankAccount, String)}
     * @utbot.invokes {@link BankAccount#getAccountHolder()}
     * @utbot.throwsException {@link NullPointerException} when: bankAccount.getAccountHolder().length() < 3
     */
    @Test
    @DisplayName("updateAccountHolder: bankAccount.getAccountHolder().length() < 3 -> ThrowNullPointerException")
    public void testUpdateAccountHolder_ThrowNullPointerException() throws InvalidAccountHolderNameException {
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, null);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.updateAccountHolder] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.updateAccountHolder(BankAccountServiceImpl.java:31) */
        bankAccountServiceImpl.updateAccountHolder(null, null);
    }

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#updateAccountHolder(BankAccount, String)}
     * @utbot.executesCondition {@code (bankAccount.getAccountHolder().length() < 3): False}
     * @utbot.invokes {@link BankAccountRepository#updateAccountHolder(BankAccount)}
     * @utbot.throwsException {@link NullPointerException} in: bankAccountRepository.updateAccountHolder(bankAccount);
     */
    @Test
    @DisplayName("updateAccountHolder: bankAccountRepository.updateAccountHolder(bankAccount) : True -> ThrowNullPointerException")
    public void testUpdateAccountHolder_ThrowNullPointerException_3() throws InvalidAccountHolderNameException {
        NotificationService notificationServiceMock = mock(NotificationService.class);
        (((NotificationService) (doNothing()).when(notificationServiceMock))).notifyUpdateAccountHolderChange(any());
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, notificationServiceMock);
        String string = "   ";
        BankAccount bankAccount = new BankAccount(null, string, 0.0);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.updateAccountHolder] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.updateAccountHolder(BankAccountServiceImpl.java:36) */
        bankAccountServiceImpl.updateAccountHolder(bankAccount, null);
    }

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#updateAccountHolder(BankAccount, String)}
     * @utbot.throwsException {@link NullPointerException} when: bankAccount.getAccountHolder().length() < 3
     */
    @Test
    @DisplayName("updateAccountHolder: bankAccount.getAccountHolder().length() < 3 -> ThrowNullPointerException")
    public void testUpdateAccountHolder_ThrowNullPointerException_1() throws InvalidAccountHolderNameException {
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, null);
        BankAccount bankAccount = new BankAccount(null, null, 0.0);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.updateAccountHolder] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.updateAccountHolder(BankAccountServiceImpl.java:31) */
        bankAccountServiceImpl.updateAccountHolder(bankAccount, null);
    }

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#updateAccountHolder(BankAccount, String)}
     * @utbot.executesCondition {@code (bankAccount.getAccountHolder().length() < 3): False}
     * @utbot.throwsException {@link NullPointerException} in: notificationService.notifyUpdateAccountHolderChange(bankAccount);
     */
    @Test
    @DisplayName("updateAccountHolder: notificationService.notifyUpdateAccountHolderChange(bankAccount) : True -> ThrowNullPointerException")
    public void testUpdateAccountHolder_ThrowNullPointerException_2() throws InvalidAccountHolderNameException {
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, null);
        String string = "   ";
        BankAccount bankAccount = new BankAccount(null, string, 0.0);
        
        /* This test fails because method [org.example.BankAccountServiceImpl.updateAccountHolder] produces [java.lang.NullPointerException]
            org.example.BankAccountServiceImpl.updateAccountHolder(BankAccountServiceImpl.java:35) */
        bankAccountServiceImpl.updateAccountHolder(bankAccount, null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method updateAccountHolder(org.example.BankAccount, java.lang.String)

    /**
     * @utbot.classUnderTest {@link BankAccountServiceImpl}
     * @utbot.methodUnderTest {@link BankAccountServiceImpl#updateAccountHolder(BankAccount, String)}
     * @utbot.executesCondition {@code (bankAccount.getAccountHolder().length() < 3): True}
     * @utbot.invokes {@link BankAccount#getAccountHolder()}
     * @utbot.invokes {@link String#length()}
     * @utbot.throwsException {@link InvalidAccountHolderNameException} when: bankAccount.getAccountHolder().length() < 3
     */
    @Test
    @DisplayName("updateAccountHolder: bankAccount.getAccountHolder().length() < 3 -> ThrowInvalidAccountHolderNameException")
    public void testUpdateAccountHolder_ThrowInvalidAccountHolderNameException() {
        BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(null, null);
        String string = "  ";
        BankAccount bankAccount = new BankAccount(null, string, 0.0);

        assertThrows(InvalidAccountHolderNameException.class, () -> bankAccountServiceImpl.updateAccountHolder(bankAccount, null));
    }
    ///endregion

    ///endregion
}
