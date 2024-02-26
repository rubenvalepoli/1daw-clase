package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static javax.print.attribute.standard.MediaSizeName.B;
import static org.junit.jupiter.api.Assertions.*;

class BankCountTest {

    @Nested
    @DisplayName("Ver qeu la clase bank este creada")

    class Count {
        BankCount bankCount;


        @BeforeEach
        @DisplayName("Crear cuenta")
        void setBankCount(){
            bankCount = new BankCount(0);
        }

        @Test
        @DisplayName("Añadir Dinero")
       void addmoney(){
            bankCount.add(5);
            assertEquals(5, bankCount.getDeposit());
        }

        @Test
        @DisplayName("Quiter dinero")
        void removemoney(){

            boolean result = bankCount.remove(200,500);
            assertTrue(result);
        }


        @Test
        @DisplayName("transfer")
        void transfer(){
            boolean result = bankCount.transfer(200,500);
            assertFalse(result);
        }


        /*

        @Test
        @DisplayName("cuenta1gana")
        void cuenta1gana(){
            boolean result = bankCount.masDinero(500,100);
            assertTrue(result);
        }
*/





    }

}