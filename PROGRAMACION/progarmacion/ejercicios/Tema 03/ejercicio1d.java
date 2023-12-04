import java.util.Scanner;
public class ejercicio1d{
    public static void main(String[] args)
    {
        String cadenaCaracteres;
        Scanner reader = new Scanner(System.in);
        int altura;
        int base;
        float area;
        System.out.println("Escribe la altura");
        altura = reader.nextInt();
        System.out.println("Escribe la base");
        base = reader.nextInt();
        area = (float) (base * altura) / 2;
        System.out.println("El area es:" + area);

    }

}