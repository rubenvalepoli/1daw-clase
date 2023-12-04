public class ejercicio5a {

    static int area(int lado){

        return lado * lado;
    }

    static int area(int base, int altura){

        return (base * altura) / 2 ;
    }

    public static void main(String[] args){

        int lado = 4, base = 2, altura = 4;

        System.out.println("area cuadrado: " + area(lado));
        System.out.println("area triangulo: " + area(base, altura));

    }

}