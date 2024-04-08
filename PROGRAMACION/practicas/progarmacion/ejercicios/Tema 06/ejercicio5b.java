import java.util.Scanner;
public class ejercicio5b {

    static int area(int lado){

        return lado * lado;
    }

    static int area(int base, int altura){

        return (base * altura) / 2 ;
    }

    public static void main(String[] args){

        int elegir;
        Scanner reader = new Scanner(System.in);
        System.out.println("1 = Area del cuadrado");
        System.out.println("2 = Area del triangulo");
        System.out.print("Resultado = ");
        elegir =  reader.nextInt();


        if (elegir == 1){
            int lado;
            System.out.print("dime la longitud del lado del cuadrado = ");
            lado = reader.nextInt();
            System.out.println("area cuadrado: " + area(lado));
        } else if (elegir == 2) {
            int base, altura;
            System.out.print("dime la base del triangulo = ");
            base = reader.nextInt();
            System.out.print("dime la altura del triangulo = ");
            altura = reader.nextInt();
            System.out.println("area triangulo: " + area(base, altura));
        } else {
            System.out.println("error");
        }

      /*  int lado, base, altura;

        System.out.println("area cuadrado: " + area(lado));
        System.out.println("area triangulo: " + area(base, altura));
*/
    }

}