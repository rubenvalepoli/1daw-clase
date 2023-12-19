package ejercicios.Tema083;

public class Calculator {

    private  int number1, number2;

    static int resultado;
    public static int Add (int number1, int number2) {

        resultado = number1 + number2;
        return resultado;
    }

    public static int Subtract (int number1, int number2) {

        resultado = number1 - number2;
        return resultado;
    }

    public static int Multiplay (int number1, int number2) {

        resultado = number1 * number2;
        return resultado;
    }

    public static int Split (int number1, int number2) {

        resultado = number1 / number2;
        return resultado;
    }

}
