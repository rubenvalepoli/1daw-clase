import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class ejercicio5c {
    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        int nota;
        List<String> aprobados = new ArrayList<>();
        List<String> suspendidos = new ArrayList<>();
        int opcion;
        String alumno;

        do {
            System.out.println("1.- Introducir alumno");
            System.out.println("0.- Salir");
            System.out.println("--------------");
            System.out.print("Opcion: ");
            opcion = reader.nextInt();
            reader.nextLine();
            if(opcion == 1) {
                System.out.print("Nombre del alumno: ");
                alumno = reader.nextLine();
                System.out.print("Nota: ");
                nota = reader.nextInt();
                if (nota >= 5) {
                    aprobados.add(alumno);
                } else {
                    suspendidos.add(alumno);
                }
            }
        } while (opcion != 0);

        System.out.println("Alumnbos aprobados");
        System.out.println(aprobados);
        System.out.println("Alumnos suspendidos");
        System.out.println(suspendidos);
        }
}