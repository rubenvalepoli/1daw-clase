package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Nested
    @DisplayName("Acelerar test")
    class Acelerate{
        Car car;

        @BeforeEach
        void setUp(){
            car = new Car("0000 BBB");
        }

        @Test
        @DisplayName("Comprovar velocidad inicio")
        void testInitialVelocity(){
            assertEquals(0,car.getVelocity());
        }

        @Test
        @DisplayName("Acelerar una vez")
        void singleAccelerate(){
            car.accelerate();
            assertEquals(5, car.getVelocity());
        }

        @Test
        @DisplayName("Acelerar muchas veces")
        void multipleAccelerate(){
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.accelerate();
            assertEquals(20, car.getVelocity());
        }

        @Test
        @DisplayName("Aceleración Determinada")
        void  determinedVelocity(){
            car.accelerate(15);
            car.accelerate(20);
            assertEquals(35,car.getVelocity());
        }


    }

}
