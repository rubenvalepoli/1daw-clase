package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LampTest {

    Lamp lamp1;
    Lamp lamp2;
    @Nested
    class ConstructorTestca{



        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.0);
            lamp2 = new Lamp(1.0, true);
        }

        @Test
        @DisplayName("Crear constructor con consuption")
        public void createConstructorOneParameter(){
            lamp1 = new Lamp(1.0);
        }

        @Test
        @DisplayName("Crear constructor con consuption y turn on")
        public void createConstructorTwoParameter(){
            lamp2 = new Lamp(1.0, true);
        }


        //No son necesarios

        @Test
        @DisplayName("VErificar consumo")
        public void checkComsuption(){
            lamp1 = new Lamp(1.0,true);
            assertEquals(1.0, lamp1.getConsuption());
        }

        @Test
        @DisplayName("VErificar estado inicial")
        public void checkTurnOn(){
            assertTrue(lamp2.isTurnedOn());
        }

        @Test
        @DisplayName("VErificar estado inicial cambio")
        public void changeturnedOn(){
            lamp2.setTurnedOn(false);
            assertFalse(lamp2.isTurnedOn());
        }


    }
    @Nested
    class TurnOnTest{

        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.0);
            lamp2 = new Lamp(1.0, true);
        }

        @Test
        public void createTurnOn(){
            lamp2.turnedOn();
        }

        @Test
        public void TurnedOnChangeLampToOn(){
            lamp2.turnedOn();
            assertTrue(lamp2.turnedOn);
        }
    }
    @Nested
    class TurnOffTest{

        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.0);
            lamp2 = new Lamp(1.0, true);
        }

        @Test
        public void createTurnOff(){
            lamp2.turnedOff();
        }

        @Test
        public void TurnedOnChangeLampToOff(){
            lamp2.turnedOff();
            assertFalse(lamp2.turnedOff);
        }
    }

    @Nested
    class ToggleTest{
        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.0);
            lamp2 = new Lamp(1.0, true);
        }
        @Test
        public void  createToggel(){
            lamp2.toggle();
        }

        @Test
        public void toggleChangeFalseToTrue(){
            lamp2.toggle();
            assertTrue(lamp2.isTurnedOn());
        }

        @Test
        public void toggleChangeFalseToFalse(){
            lamp2.setTurnedOn(true);
            lamp2.toggle();
            assertFalse(lamp2.isTurnedOn());
        }





    }

    @Nested
    class ConsumeTets{

        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(2.0);
            lamp2 = new Lamp(2.0, true);
        }


        @Test
        public void createConsume(){
            lamp2.consume(3.5);
        }

        /*@Test
        public void consumeReturnDouble(){
            assertEquals(3.5,lamp2.consume(3.5));
        }*/

        @Test
        public void consumeApagadaReturnZero(){
            lamp2.setTurnedOn(false);
            assertEquals(0,lamp2.consume(3.5));

        }
        @ParameterizedTest
        @ValueSource(doubles ={0,0.5,1.5,2.7,3.9,4})
        public void consumeEncendidaReturnKW(double sec){
            double expected= lamp2.getConsuption()*sec/3600;
            assertEquals(expected,lamp2.consume(sec));
        }
    }
}