package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static javax.print.attribute.standard.MediaSizeName.B;
import static org.junit.jupiter.api.Assertions.*;

class BankCountTest {
/*
    @Test
    @DisplayName("Comprueba si BAncacount esta creado")
    void createBAncAcount(){
        BankCount bankCount = new BankCount();
    }
*/

    @Nested
    class CheckConstructor{
    @Test
    void constructor1BankCountExist(){
        BankCount bankCount = new BankCount(1,"Paolo");
    }
    @Test
    void constructor2BankCountExist(){
        BankCount bankCount = new BankCount(2,"Paolo", 5000);
    }

    @Test
    void checkGeters1(){
        BankCount bankCount = new BankCount(2,"Paolo", 5000);

        assertEquals(2, bankCount.getNum());
        assertEquals("Paolo", bankCount.getName());
        assertEquals(5000, bankCount.getSaldo());
    }
    @Test
    void checkGeters2(){
        BankCount bankCount = new BankCount(2,"Paolo");

        assertEquals(2, bankCount.getNum());
        assertEquals("Paolo", bankCount.getName());
        assertEquals(0, bankCount.getSaldo());
    }
    }

    @Nested
    class Deposit{
        BankCount bankCount;

        @BeforeEach
        void setUp(){
            bankCount = new BankCount(2,"Ruben");
        }

/*        @Test
        void checkMetodDeposit(){
            bankCount.deposit();
        }*/

        @Test
        void CorrectIngreso(){
            assertTrue(bankCount.deposit(50));
        }

        @Test
        void CheckSaldo(){

        }

        @Test
        void IngresoNoNegativo(){

        }



    }







}