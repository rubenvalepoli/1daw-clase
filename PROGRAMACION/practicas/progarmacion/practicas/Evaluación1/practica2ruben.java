import java.util.Scanner;
public class practica2ruben {
    static String USUARIO = "usuario";
    static String PASSWORD_USUARIO = "usuario";
    static String ADMIN = "admin";
    static String PASSWORD_ADMIN = "admin";
    static int valor;
    static int opcion;
    static int opcionuser;
    static int opcionadmin;


    static int checkUser(String usuarioIngresado, String passwordIngresada) {
        if (usuarioIngresado.equals(USUARIO) && passwordIngresada.equals(PASSWORD_USUARIO)) {
            return 0;
        } else if (usuarioIngresado.equals(ADMIN) && passwordIngresada.equals(PASSWORD_ADMIN)) {
            return 1;
        } else {
            return -1;
        }
    }

    static void buildMainMenu() {
        if (valor == 0) {

            System.out.println("1.- Peliculas");
            System.out.println("2.- Configuracion usuario");
            System.out.println("0.- Salir");
            System.out.println("------------------------------");
            System.out.print("Opcion: ");

        } else if (valor == 1) {

            System.out.println("1.- Administrar peliculas");
            System.out.println("2.- Administrar usuarios");
            System.out.println("0.- Salir");
            System.out.println("------------------------------");
            System.out.print("Opcion: ");

        } else if (valor == -1){
            System.out.println("Valor incorrecto");
            System.exit(0);
        }
    }

    static void buildUserMenu() {
        if (opcion == 1) {

            System.out.println("1.- Casablanca");
            System.out.println("2.- El padrino");
            System.out.println("0.- Volver");
            System.out.println("------------------------------");
            System.out.print("Opcion: ");

        } else if (opcion == 2) {

            System.out.println("1.- Cambiar nombre de usuario");
            System.out.println("2.- Cambiar password");
            System.out.println("0.- Volver");
            System.out.println("------------------------------");
            System.out.print("Opcion: ");

        } else if (opcion == 0){
            System.exit(0);

        }
    }

    static void buildAdminMenu() {
        if (opcion == 1) {

            System.out.println("1.- Anyadir pelicula");
            System.out.println("2.- Modificar pelicula");
            System.out.println("3.- Borrar pelicula");
            System.out.println("0.- Volver");
            System.out.println("------------------------------");
            System.out.print("Opcion: ");

        } else if (opcion == 2) {

            System.out.println("1.- Aniadir usuario");
            System.out.println("2.- Borrar usuario");
            System.out.println("0.- Volver");
            System.out.println("------------------------------");
            System.out.print("Opcion: ");

        } else if (opcion == 0){
            System.exit(0);
        }
    }

    static void main (){
        Scanner reader = new Scanner(System.in);

        String usuarioIngresado;
        String passwordIngresada;
        int intentos = 0;

        while (intentos < 3) {

            System.out.print("Usuario:");
            usuarioIngresado = reader.nextLine();
            System.out.print("Contrasenya:");
            passwordIngresada = reader.nextLine();
            valor = checkUser(usuarioIngresado, passwordIngresada);


            if (valor == -1){
                intentos = intentos + 1;

            } else {
                intentos = intentos + 4;
                do {
                    buildMainMenu();
                    opcion = reader.nextInt();

                    do{

                        if(valor == 0) {
                            buildUserMenu();
                            opcionuser = reader.nextInt();
                        }

                    } while (opcionuser != 0);


                    do {
                        if (valor == 1) {
                            buildAdminMenu();
                            opcionadmin = reader.nextInt();
                        }
                    } while (opcionadmin != 0);

                } while (opcion != 0);
            }
        }
    }
    public static void main(String[] args) {
        main();
    }
}




