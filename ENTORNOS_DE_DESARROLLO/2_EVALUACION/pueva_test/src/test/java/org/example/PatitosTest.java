package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatitosTest {

    @Nested
    @DisplayName("Comprobar Clase patitos")

    class Crear{
        Patitos patitos;


    @BeforeEach
    @DisplayName("creamos patito")
    void setPato(){
        patitos = new Patitos(1);
    }

    @Test
        @DisplayName("Provar numero patos")
        void numpatos(){
        patitos.numpatitos(1);
        assertEquals(1, patitos.getNumpatitos());
    }




    }
}