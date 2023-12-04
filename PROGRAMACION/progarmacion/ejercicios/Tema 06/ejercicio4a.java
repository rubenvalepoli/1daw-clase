public class ejercicio4a {

    static int sumar(int... numero){
        int numeros = 0;
        for (int i = 0; i < numero.length; i++) {
         numeros += numero[i];
        }
        return numeros;
    }

    public static void main(String[] args){


        System.out.println("Resultado: " + sumar(2, 3));
        System.out.println("Resultado: " + sumar(2, 3, 8));

    }

}