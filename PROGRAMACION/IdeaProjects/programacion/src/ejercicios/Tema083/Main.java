package ejercicios.Tema083;

public class Main {
    public static void main(String[] args){

        System.out.println(Calculator.Add(1,2));
        System.out.println(Calculator.Subtract(2,1));
        System.out.println(Calculator.Multiplay(2,2));
        System.out.println(Calculator.Split(10,2));

    Singleton.getinstance();
    Singleton.checkinstnce();

    GeneradorId.getinstancia();

        GeneradorId generador1 = GeneradorId.getinstancia();
        GeneradorId generador2 = GeneradorId.getinstancia();
        System.out.println("ID generado: " + generador1.getUuid());
        System.out.println("ID generado: " + generador2.getUuid());

    }
}
