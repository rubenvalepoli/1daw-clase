package exam2;

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
    class testConstructor {

        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.5);
            lamp2 = new Lamp(1.5, true);
        }

        @Test
        @DisplayName("Crear constructor con consumption")
        public void crearConstructorUnParametro(){
            lamp1 = new Lamp(1.5);
        }

        @Test
        @DisplayName("Crear un constructor con consumption y turnOn")
        public void crearConstructorDosParametro(){
            lamp2 = new Lamp(1.5,true);
        }

        }


    @Nested
    class TestTurnOn{
        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.5);
            lamp2 = new Lamp(1.5, true);
        }

        @Test
        @DisplayName("Comprobamos si TurnOn esta creado")
        public void crearTurnOn(){
            lamp2.turnedOn();
        }

        @Test
        @DisplayName("Comprobamos qeu turnOn Cambia a turn Off")
        public void TurnOncambiaTurnOff(){
            lamp2.turnedOn();
            assertTrue(lamp2.turnedOn);
        }

    }


    @Nested
    class TestTurnOff{
        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.5);
            lamp2 = new Lamp(1.5, true);
        }

        @Test
        @DisplayName("Comprobar que turn off esta creado")
        public void crearTurnOff(){
            lamp2.turnedOff();
        }

        @Test
        @DisplayName("Comprobamos qeu turnOff Cambia a turn On")
        public void TurnOffcambiaTurnOn(){
            lamp2.turnedOff();
            assertFalse(lamp2.turnedOff);
        }

    }

    @Nested
    class TestToggle{
        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.5);
            lamp2 = new Lamp(1.5, false);
        }

        @Test
        @DisplayName("Comprobamos que Toogle esta creado")
        public void crearToggle(){
            lamp2.toggle();
        }

        @Test
        @DisplayName("Cambiamos Toogle de Verdadero a falso")
        public void  cambiarToogledeVerdaderoafalso(){

            lamp2.toggle();
            assertTrue(lamp2.isTurnedOn());
        }

        @Test
        @DisplayName("Cambiamos el toogle de Falso a Verdaero")
        public void cambiarToogledeFalsoaVerdadero(){
            lamp2.setTurnedOn(true);
            lamp2.toggle();
            assertFalse(lamp2.isTurnedOn());
        }


    }

    @Nested
    class testCostmer{
        @BeforeEach
        public void setUp(){
            lamp1 = new Lamp(1.5);
            lamp2 = new Lamp(1.5, true);
        }

/*        @Test
        @DisplayName("Comprobamos que En consumo se devuelve un Doble")
        public void devolverDobleEnConsumo(){
            assertEquals(1.5,lamp2.consumption(1.5));
        }*/


        @Test
        @DisplayName("Comprobamos qeu si apagamos la luz devuelve Cero")
        public void DevueelveCeroSiApagaLuz(){
            lamp2.setTurnedOn(false);
            assertEquals(0,lamp2.consumption(3.5));
        }

        @ParameterizedTest
        @DisplayName("Comprobamos que da bien el resultado cuando esta encendido, esto lo hacemos con test parametrizados")
        @ValueSource(doubles = {0,0.5,1,2.8,5,7.8})
        public void ConsumoEncendidoDevuelve(double segundo){
            double expected = lamp2.getConsumption()*segundo/3600;
            assertEquals(expected,lamp2.consumption(segundo));

        }


    }



}





