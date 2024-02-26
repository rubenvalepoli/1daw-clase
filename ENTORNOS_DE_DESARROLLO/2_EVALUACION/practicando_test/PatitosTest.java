package practiques;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PatitosTest {
    public Patitos patitos;
    @Nested
    class ConstructorTest {
        @Test
        @DisplayName("Crear el constructor con un parametro")
        void constructorOneParameter() {
            int num = 4;
            patitos = new Patitos(num);
        }

        @Test
        void checkNumPatitos() {
            patitos = new Patitos(4);
            assertEquals(4, patitos.getNum());
        }

        @Test
        void changeNumPatitos() {
            patitos = new Patitos(5);
            patitos.setNum(6);
            assertEquals(6, patitos.getNum());
        }
    }
    @Nested
    class CountPatitosTest{
        @BeforeEach
        void setUp(){
            patitos = new Patitos(1);
        }
        @Test
        void createCountPatitos(){
            patitos.countPatitos();
        }
        @Test
        void countPatitosReturnBoolean(){
            assertTrue(patitos.countPatitos());
        }
        @Test
        void countPatitosRefuseNegative(){
            patitos.setNum(-3);
            assertFalse(patitos.countPatitos());
        }
        @Test
        void checkPicos(){
            patitos.countPatitos();
            assertEquals(1,patitos.getPicos());
        }
        @Test
        void checkGetPatas(){
            assertEquals(0, patitos.getPatas());
        }

        @Test
        void setPatas(){
            patitos.countPatitos();
            assertEquals(2, patitos.getPatas());
        }
        @ParameterizedTest
        @ValueSource(ints={1,2,3,4,5,6})
        void checkCountPatitosPicos(int num){
            patitos.setNum(num);
            patitos.countPatitos();
            assertEquals(num,patitos.getPicos());
        }
        @ParameterizedTest
        @ValueSource(ints={1,2,3,4,5,6})
        void checkCountPatitosPatas(int num){
            patitos.setNum(num);
            patitos.countPatitos();
            assertEquals(num*2,patitos.getPatas());
        }
    }

}