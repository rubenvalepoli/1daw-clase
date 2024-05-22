package ud5.practices.bank;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    public BankAccount bankAccount;
    public BankAccount bankAccount2;

    @Nested
    class ConstructorTest{
        @Test
        @DisplayName("Introducir numero de cuenta y nombre")
        void createConstructorTwoParameters(){
            bankAccount = new BankAccount("123456","soledad");
        }
        @Test
        @DisplayName("Verificar adjudicacion numero de cuenta")
        void checkNumAccountTwo(){
            bankAccount = new BankAccount("123456","soledad");
            assertEquals("123456",bankAccount.getNumAccount());
        }
        @Test
        @DisplayName("Verificar adjudicacion nombre")
        void checkNameTwo(){
            bankAccount = new BankAccount("123456","soledad");
            assertEquals("soledad",bankAccount.getName());
        }
        @Test
        @DisplayName("Verificar adjudicacion saldo inicial")
        void checkCreditTwo(){
            bankAccount = new BankAccount("123456","soledad");
            assertEquals(0,bankAccount.getCredit());
        }
        @Test
        @DisplayName("Introducir numero de cuenta, nombre y saldo inicial")
        void createConstructorThreeParameters(){
            bankAccount = new BankAccount("123456","soledad",100);
        }
        @Test
        @DisplayName("Verificar adjudicacion numero cuenta")
        void checkNumAccountThree(){
            bankAccount = new BankAccount("123456","soledad",100);
            assertEquals("123456",bankAccount.getNumAccount());
        }
        @Test
        @DisplayName("Verificar adjudicacion nombre")
        void checkNameThree(){
            bankAccount = new BankAccount("123456","soledad",100);
            assertEquals("soledad",bankAccount.getName());
        }
        @Test
        @DisplayName("Verificar adjudicacion saldo inicial")
        void checkCreditThree(){
            bankAccount = new BankAccount("123456","soledad",100);
            assertEquals(100,bankAccount.getCredit());
        }
    }

    @Nested
    class DepositTest{
        @BeforeEach
        void setUp(){
            bankAccount = new BankAccount("123456","soledad");
        }
        @Test
        @DisplayName("Crear funcion Deposit")
        void createFunctionDeposit(){
            bankAccount.deposit(0);
        }
        @Test
        @DisplayName("Acepta deposito positivo")
        void depositReturnTrue(){
            assertTrue(bankAccount.deposit(5));
        }

        @ParameterizedTest(name = "Aumenta el credito {0}")
        @ValueSource (ints = {0,-10})
        @DisplayName("No acepta deposito negativo o zero")
        void withdrawOutcomeNegativeOrZeroReturnFalse(int number) {
            assertFalse(bankAccount.deposit(number));
        }

        @DisplayName("Aumenta el saldo de la cuenta")
        @ParameterizedTest(name = "Aumenta el credito {0}")
        @ValueSource (ints = {5,10})
        void depositModifyCredit(int number){
            double expected = bankAccount.getCredit() + number ;
            bankAccount.deposit(number);
            assertEquals(expected,bankAccount.getCredit());
        }

        @ParameterizedTest(name = " Multiples ingresos {0} y {1}")
        @CsvSource ({"2,10","1,90"})
        @DisplayName("Acepta varios depositos")
        void multipleDepositModifyCredit(int number1, int number2){
            double expected = bankAccount.getCredit() + number1 + number2;
            bankAccount.deposit(number1);
            bankAccount.deposit(number2);
            assertEquals(expected,bankAccount.getCredit());
        }
    }

    @Nested
    class WithdrawTest{
        @BeforeEach
        void setup() {
            bankAccount = new BankAccount("52529849", "soledad",100);
        }
        @Test
        @DisplayName("Crear la funcion WithDraw")
        void createWithDraw() {
            assertTrue(bankAccount.withdraw(5));
        }

        @ParameterizedTest(name = "Retirar saldo de {0}")
        @ValueSource (ints = {0,-5})
        @DisplayName("No acepta retirar saldo negativo o zero ")
        void withdrawOutcomeNegativeOrZeroReturnFalse(int number) {
            assertFalse(bankAccount.withdraw(number));
        }

        @ParameterizedTest(name = "Retirada de saldo {0}")
        @ValueSource (ints = {10,5})
        @DisplayName("Acepta retirada de saldo positiva")
        void withdrawOutcomePositiveReturnTrue(int number) {
            assertTrue(bankAccount.withdraw(number));
        }

        @ParameterizedTest(name = "Retirada de saldo mayor que {0}")
        @ValueSource (ints = {201,500})
        @DisplayName("No acepta retirada de saldo mayor al credito")
        void withdrawOutcomeSuperiorCreditReturnFalse(int number){
            assertFalse(bankAccount.withdraw(number));
        }


        @DisplayName("Reduce el saldo")
        @ParameterizedTest(name = "Reducir el credito {0}")
        @ValueSource (ints = {5,10})
        void withdrawReducesCredit(int outcome) {
            double expected = bankAccount.getCredit() - outcome;
            bankAccount.withdraw(outcome);
            assertEquals(expected, bankAccount.getCredit());
        }

        @ParameterizedTest(name = " Multiples ingresos {0} y {1}")
        @CsvSource ({"5,10","1,90"})
        @DisplayName("Reduce el saldo")
        void withdrawMultiple(int number1, int number2) {
            double expected = bankAccount.getCredit() - number1 - number2 ;
            bankAccount.withdraw(number1);
            bankAccount.withdraw(number2);
            assertEquals(expected, bankAccount.getCredit());
        }
    }

    @Nested
    class TransferTest{
        @BeforeEach
        void setup() {
            bankAccount = new BankAccount("456789", "Soledad",100);
            bankAccount2 = new BankAccount("123456","Angela",200);
        }

        @Test
        @DisplayName("Crear funcion Transfer")
        void createTransfer() {
            assertTrue(bankAccount.transfer(bankAccount2, 5));
        }

        @ParameterizedTest(name="Transferencia de {0}")
        @ValueSource(ints = {0,-5})
        @DisplayName("No acepta transferencia negativa o zero")
        void transferOutcomeNegativeOrZeroReturnFalse(int number) {
            assertFalse(bankAccount.transfer(bankAccount2, number));
        }

        @ParameterizedTest(name="Transferencia de {0}")
        @ValueSource(ints = {1,10})
        @DisplayName("Acepta transferencia positiva")
        void transferOutcomePositiveReturnTrue(int number) {
            assertTrue(bankAccount.transfer(bankAccount2, number));
        }

        @ParameterizedTest(name="Transferencia de {0}")
        @ValueSource(ints = {101,210})
        @DisplayName("No acepta transferencia mayor al saldo")
        void transferOutcomeSuperiorCreditReturnFalse(double number){
            assertFalse(bankAccount.transfer(bankAccount2, number));
        }

        @ParameterizedTest(name="Transferencia de {0}")
        @ValueSource(ints = {1,50,100})
        @DisplayName("El saldo se reduce en la cuenta de origen")
        void transferReducesCreditFromOrigin(int number) {
            int expected = 100-number;
            bankAccount.transfer(bankAccount2, number);
            assertEquals(expected, bankAccount.getCredit());
        }

        @ParameterizedTest(name="Transferencia de {0}")
        @ValueSource(ints = {1,50,100})
        @DisplayName("El saldo aumenta en la cuenta de destino")
        void transferIncreasesCreditFromDestiny(int number) {
            int expected = 200+number;
            bankAccount.transfer(bankAccount2, number);
            assertEquals(expected, bankAccount2.getCredit());
        }

        @ParameterizedTest(name="Transferencia doble de {0} y de {1}")
        @CsvSource({"1,2","10,20","50,50"})
        @DisplayName("Acepta varias transferencia de una cuenta")
        void transferMultiple(int number1,int number2) {
            double expected = bankAccount.getCredit()-number1-number2;
            bankAccount.transfer(bankAccount2, number1);
            bankAccount.transfer(bankAccount2, number2);
            assertEquals(expected, bankAccount.getCredit());
        }
        @ParameterizedTest(name="Transferencia de {0} y de {1}")
        @CsvSource({"1,2","10,20","50,50"})
        @DisplayName("Acepta transferencias de distintas cuentas")
        void transferMultipleDirection(int number1,int number2) {
            double expected = bankAccount.getCredit()-number1-number2;
            bankAccount.transfer(bankAccount2, number1);
            bankAccount.transfer(bankAccount2, number2);
            assertEquals(expected, bankAccount.getCredit());
        }
        @ParameterizedTest(name="Transferencia de {0} y de {1}")
        @CsvSource({"50,60","100,1"})
        @DisplayName("No acepta varias transferencias con suma mayor al saldo")
        void transferToManyReturnFalse(int number1,int number2) {
            bankAccount.transfer(bankAccount2, number1);
            boolean result = bankAccount.transfer(bankAccount2, number2);
            assertFalse(result);
        }
    }
}