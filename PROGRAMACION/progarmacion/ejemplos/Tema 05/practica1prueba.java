import java.util.Scanner;
public class practica1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String USUARIO = "usuario";
        String PASSWORD_USUARIO = "usuario";
        String ADMIN = "admin";
        String PASSWORD_ADMIN = "admin";
        String usuarioIngresado;
        String passwordIngresada;
        int opcionuser;
        int opcionuser1;
        int opcionuser2;
        int opcionadmin;
        int opcionadmin1;
        int opcionadmin2;
        int bucle = 1;
        int bucleadmin = 1;
        int numerointentos = 0;


        while (numerointentos < 3){
        System.out.print("Usuario:");
        usuarioIngresado = reader.nextLine();
        System.out.print("Contrasenya:");
        passwordIngresada = reader.nextLine();


        if (usuarioIngresado.equals(USUARIO) && passwordIngresada.equals(PASSWORD_USUARIO)) {

            while (bucle > 0){

                int bucle1 = 1;
                int bucle2 = 1;
                System.out.println("1.- Peliculas");
                System.out.println("2.- Configuracion usuario");
                System.out.println("0.- Salir");
                System.out.println("------------------------------");
                System.out.print("Opcion: ");
                opcionuser = reader.nextInt();

                if (opcionuser == 0) {
                    bucle = 0;
                }


                switch (opcionuser) {
                    case 0:
                        break;
                    case 1:

                        while (bucle1 > 0){

                            System.out.println("1.- Casablanca");
                            System.out.println("2.- El padrino");
                            System.out.println("0.- Volver");
                            System.out.println("------------------------------");
                            System.out.print("Opcion: ");
                            opcionuser1 = reader.nextInt();

                            if (opcionuser1 == 0) {
                                bucle1 = 0;
                            } else {
                                bucle2 = 0;
                            }
                        }

                    case 2:


                        while (bucle2 > 0){
                            System.out.println("1.- Cambiar nombre de usuario");
                            System.out.println("2.- Cambiar password");
                            System.out.println("0.- Volver");
                            System.out.println("------------------------------");
                            System.out.print("Opcion: ");
                            opcionuser2 = reader.nextInt();

                            if (opcionuser2 == 0) {
                                bucle2 = 0;
                            }
                        }
                }
            }

        } else if (usuarioIngresado.equals(ADMIN) && passwordIngresada.equals(PASSWORD_ADMIN)) {

            while (bucleadmin > 0){

                int bucleadmin1 = 1;
                int bucleadmin2 = 1;

                System.out.println("1.- Administrar peliculas");
                System.out.println("2.- Administrar usuarios");
                System.out.println("0.- Salir");
                System.out.println("------------------------------");
                System.out.print("Opcion: ");
                opcionadmin = reader.nextInt();

                if (opcionadmin == 0){
                    bucleadmin = 0;
                }

                switch (opcionadmin) {
                    case 0:
                        break;
                    case 1:

                        while (bucleadmin1 > 0)
                        {

                            System.out.println("1.- Aniadir pelicula");
                            System.out.println("2.- Modificar pelicula");
                            System.out.println("3.- Borrar pelicula");
                            System.out.println("0.- Volver");
                            System.out.println("------------------------------");
                            System.out.print("Opcion: ");
                            opcionadmin1 = reader.nextInt();
                            if (opcionadmin1 == 0){
                                bucleadmin1 = 0;
                            } else {
                                bucleadmin2 = 0;
                            }

                        }
                    case 2:

                        while (bucleadmin2 > 0)
                        {

                            System.out.println("1.- Aniadir usuario");
                            System.out.println("2.- Borrar usuario");
                            System.out.println("0.- Volver");
                            System.out.println("------------------------------");
                            System.out.print("Opcion: ");
                            opcionadmin2 = reader.nextInt();
                            if (opcionadmin2 == 0)
                                bucleadmin2 = 0;
                        }
                }
            }
        }else {
            System.out.println("error");
            numerointentos = numerointentos + 1;

        }
        }
    }

}