import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ejercicio5a {
    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        int nota;

        List<String> alumnos = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        for (String alumno: alumnos) {
            System.out.println("Nota de " + alumno + ": ");
            nota = reader.nextInt();
            if (nota >= 5) {
                System.out.println(alumno + "está aprobado con un " + nota);
            }
        }
    }
}