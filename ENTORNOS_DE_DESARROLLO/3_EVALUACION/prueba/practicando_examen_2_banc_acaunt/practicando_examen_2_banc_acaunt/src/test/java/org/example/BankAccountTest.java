package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {



    /*@BeforeEach
    void setup(){
        BankAccount bankAccount = new BankAccount();
    }*/
    @Nested
    public class NestedInstance {
        @Test
        @DisplayName("Constructor1DoesExist")
        public void comprovateBankAccount(){
            BankAccount bankAccount= new BankAccount("2525", "Isabel");
        }

        @Test
        @DisplayName("Constructor2DoesExist")
        public void comprovateBankAccount2(){
            BankAccount bankAccount= new BankAccount("2525", "Isabel", 2345);
        }

    }
    @Nested
    public class NestedImplements{
        /*@Test
        @DisplayName("DepositAccount")
        public void depositAccount(){
            BankAccount bankAccount= new BankAccount(225, "Isabel");
            bankAccount.deposit();
        }*/

        @Test
        @DisplayName("IncomeDeposit")
        public void incomeDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel", 100);
            boolean result = bankAccount.deposit(10);

            assertTrue(result);
            assertEquals(110, bankAccount.getBalance());
        }

        @Test
        @DisplayName("IncomeNegativeDeposit")
        public void incomeNegativeDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel",100);
            assertFalse(bankAccount.deposit(-7));
        }

        @Test
        @DisplayName("IncomeZeroDeposit")
        public void incomeZeroDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel",100);
            assertFalse(bankAccount.deposit(0));
        }

        /*@Test
        @DisplayName("WithdrawExists")
        public void withdrawExists(){
            BankAccount bankAccount= new BankAccount(225, "Isabel");
            bankAccount.withdraw();
        }*/

        @Test
        @DisplayName("RemoveDeposit")
        public void removeDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel",100);
            boolean result = bankAccount.withdraw(10);
            assertTrue(result);
            assertEquals(90, bankAccount.getBalance());
        }

        @Test
        @DisplayName("RemoveNegativeDeposit")
        public void removeNegativeDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel",100);
            assertFalse(bankAccount.withdraw(-5));
        }

        @Test
        @DisplayName("RemoveZeroDeposit")
        public void removeZeroDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel",100);
            assertFalse(bankAccount.withdraw(0));
        }

        @Test
        @DisplayName("RemoveEqualDeposit")
        public void removeEqualDeposit(){
            BankAccount bankAccount= new BankAccount("225", "Isabel",100);
            assertTrue(bankAccount.withdraw(100));
        }

        @Test
        @DisplayName("RemoveSuperiorDeposit")
        public void removeSuperiorDeposit(){
            BankAccount bankAccount= new BankAccount("255", "Isabel", 100);
            assertFalse(bankAccount.withdraw(160));
        }

        /*@Test
        @DisplayName("TransferExists")
        public void transferExists(){
            BankAccount bankAccount= new BankAccount(225, "Isabel");
            bankAccount.transfer();
        }*/
/*

        @Test
        @DisplayName("TransferWorks")
        public void transferWorks(){
            // Arrange
            BankAccount b1 = new BankAccount("225", "Isabel",200);
            BankAccount b2 = new BankAccount("335", "Rubén", 200);

            // Act
            boolean result = b1.transfer("100", b1, b2);

            // Assert
            assertTrue(result);
            assertEquals(100, b1.getBalance());
            assertEquals(300, b2.getBalance());
        }

        @Test
        @DisplayName("NegativeTransfer")
        public void negativeTransfer(){
            BankAccount b1= new BankAccount("225", "Isabel",200);
            BankAccount b2 = new BankAccount("335", "Rubén", 200);
            assertFalse(b1.transfer(-5, b1, b2));
        }

        @Test
        @DisplayName("ZeroTransfer")
        public void zeroTransfer(){
            BankAccount b1= new BankAccount("225", "Isabel",200);
            BankAccount b2 = new BankAccount("335", "Rubén", 200);
            assertFalse(b1.transfer(0, b1, b2));
        }


        @Test
        @DisplayName("TransferEqualDeposit")
        public void TransferEqualDeposit(){
            BankAccount b1 = new BankAccount ("225", "Isabel",100);
            BankAccount b2 = new BankAccount("335", "Rubén", 200);
            assertTrue(b1.transfer(100, b1, b2));
        }

        @Test
        @DisplayName("TransferSuperiorDeposit")
        public void transferSuperiorDeposit(){
            BankAccount b1= new BankAccount("225", "Isabel", 200);
            BankAccount b2 = new BankAccount("335", "Rubén", 200);
            assertFalse(b1.transfer("250", b1, b2));
        }
*/

    }

}