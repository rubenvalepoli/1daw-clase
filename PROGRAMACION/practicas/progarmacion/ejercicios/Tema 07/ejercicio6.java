import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class ejercicio6 {
    static Scanner reader = new Scanner(System.in);


    public static void main (String[] args) {

        int nota;
        final String[] alumnos = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        Map<String, Integer> notasAlumnos = new HashMap<>();
        List<String> aprobados = new ArrayList<>();
        
        for (String alumno : alumnos){
            System.out.println("Nota de " + alumno + ": ");
            nota = reader.nextInt();
            notasAlumnos.put(alumno, nota);
        }
        System.out.println(notasAlumnos);
    }
    
}
