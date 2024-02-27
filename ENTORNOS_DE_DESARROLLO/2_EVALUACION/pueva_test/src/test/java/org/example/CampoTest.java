package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CampoTest {

/*    @Test
    @DisplayName("Es para comprobar que hemos pasdo creaso bien la clase")
    void testClassCampoCreado(){
        Campo campo = new Campo();
    }*/

    public Campo campo;

    @Nested
    @DisplayName("Test de consructores")
    class TestConstuctorGetYSet{

        @Test
        @DisplayName("Comrobando qeu el contrucctor existe y que las variables van")
        void constructorTwoParametres(){
            int yearAbu = 60;
            int yearIglesia = 1000;
            campo = new Campo(yearAbu,yearIglesia);
        }

        @Test
        @DisplayName("Test get y seter de yearAbu")
        void chetgetyearabu(){
            campo = new Campo(60,1000);

            assertEquals(60, campo.getYearAbu());
        }


        @Test
        @DisplayName("Test get y seter de YearIglesia")
        void chetgetyearIglesia(){
            campo = new Campo(60,1000);

            assertEquals(1000, campo.getYearIgleasia());
        }
        @Test
        @DisplayName("Comprobar seters")
        void setEdadAbu(){
            campo = new Campo(70, 1000);
            campo.setYearAbu(80);
            assertEquals(80, campo.getYearAbu());
        }
        @Test
        @DisplayName("Comprobar seters")
        void setyeariglesia(){
            campo = new Campo(70, 1000);
            campo.setYearIgleasia(1000);
            assertEquals(1000, campo.getYearIgleasia());
        }

    }

    @Nested
    class comprobarEdadTest {
        @BeforeEach
        void setUp() {
            campo = new Campo(60, 1000);
        }

        @Test
        @DisplayName("Comprobar si edad existe")
        void comprobarEdad() {
            campo.comprobarEdad();
        }

/*     @Test
     @DisplayName("Comprobar si la edad devielve un String")
     void comprobarEdadReturnInt(){
        campo.getYearAbu();
        String yearabuString =  String.valueOf(campo.getYearAbu());
         //assertSame(0,campo.comprobarEdad());
     }*/

        // @Test
        // @DisplayName("No se puede pasar negativos")
        //   void


        // }
    }
}
