package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MotoTest {


/*    @Test
    @DisplayName("crear MOTO")
    public void test_crear_moto(){
        Moto nuevamoto = new Moto();
    }*/

    @Nested
    @DisplayName("Todo")

    class Acelerar{
        Moto moto;


    @BeforeEach
    @DisplayName("Crear moto")
    void setNuevamoto(){
       moto = new Moto(0);
    }


    @Test
    @DisplayName("crear MOTO con velocidad 0")
    public void test_velocidad_0_moto(){
       assertEquals(0, moto.getVelicidad());
    }



        @Test
        @DisplayName("acelerar moto velocidad disminuye")
        public void test_acelerar_moto(){
            moto.acelerar(20);
            assertEquals(20, moto.getVelicidad());
        }

    @Test
    @DisplayName("decelerar moto velocidad disminuye")
    public void test_decelerar_moto(){
        moto.decelerar(20);
        assertEquals(-20, moto.getVelicidad());
    }

    @Test
    @DisplayName("Acelerar y decelerar")
        public void acelerar_decelerar(){
        moto.acelerar(100);
        assertEquals(100,moto.getVelicidad());
        moto.decelerar(50);
        assertEquals(50,moto.getVelicidad());
    }

    @Test
    @DisplayName("Parar")
        public void parar(){
        moto.parar(0);
        assertEquals(0, moto.getVelicidad());
    }

    @Test
    @DisplayName("Adelantar")
        public void adelantar(){
        moto.adelantar(20);
        assertEquals(20, moto.getVelicidad());
    }





    }

}