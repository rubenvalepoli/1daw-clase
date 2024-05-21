package unit.controller;

import org.example.controller.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Nested
    public class NestedInstance{
        @Test
        @DisplayName("Constructor sin velocidad existe")
        public void constructorSinVelocidadExiste(){
            Car car = new Car("8086E","Ford","Fiesta");
        }

        @Test
        @DisplayName("Constructor con velocidad existe")
        public void constructorConVelocidadExiste(){
            Car car = new Car("8086E","Ford","Fiesta",20);
        }
    }


}