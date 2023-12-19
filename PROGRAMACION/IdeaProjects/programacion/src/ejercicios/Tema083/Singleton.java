package ejercicios.Tema083;

public class Singleton {
    private static Singleton instance;

    private static int contador = 0;


    public Singleton() {
    }

    public static Singleton getinstance(){

        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }


    public static Singleton getInstance() {
        return instance;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public static void checkinstnce (){

        System.out.println("Instancia creada. Contador:{" + contador +"}" );

    }

}
