package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampTest {

        Lamp lamp1;
        Lamp lamp2;
    @Nested
    class testConstructor{
        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.0);
            lamp2 = new Lamp(1.0,true);
        }

        @Test
        public void crearConstructorUnParametro(){
            lamp1 = new Lamp(1.0);
        }
        @Test
        public void crearConstructorDobleParametro(){
            lamp1 = new Lamp(1.0,true);
        }

    }

    @Nested
    class TurnOnTest{
    @BeforeEach
    public void setUp(){
        lamp1 = new Lamp(1.0);
        lamp2 = new Lamp(1.0,true);
    }




    }

}