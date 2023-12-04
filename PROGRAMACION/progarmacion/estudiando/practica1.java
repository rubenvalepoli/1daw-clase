import java.util.Scanner;

public class practica1 {
    static Scanner scanner = new Scanner(System.in);
    static final String usuario = "usuario"; 
    static final String admin = "admin"; 
    static String credentialuser;
    static String credentialcont;
    static int valor;
    static int opcionuser;
    static int opcionadmin;
    
 
    public static void main (String[] args) {
        int attempts = 0;
        
        while (attempts < 3) {

            System.out.print("Usuario: ");
            credentialuser = scanner.next();

            System.out.print("Contrasenya: ");
            credentialcont = scanner.next();
                checkUser();
                valor = checkUser();

            if (valor == -1) {
                attempts ++;
            } else {
                attempts = attempts + 4;

                switch (valor) {
                case 0:
                       
                    buildMainMenu();
                    buildUserMenu();
                    break;
            
                case 1:
                    buildMainMenu();
                    buildAdminMenu();
                    break;
            
                case -1:
                    
                    break;
            
                default:
                    break;
            }

            }

            
        }


    }

    public static int checkUser() {
       
        if (credentialuser.equals(usuario) && credentialcont.equals(usuario)) {

            return 0;

        } else if (credentialuser.equals(admin) && credentialcont.equals(admin)) {

        return 1;    
        
        } else {
            return -1;
        }    
    }

    public static void buildMainMenu(){

        if (valor == 0) {

            System.out.println("1.- Peliculas");
            System.out.println("2.- Configuracion usuario");
            System.out.println("0.- Salir");
            System.out.println("---------------------------");
            System.out.print("Option: ");
            opcionuser = scanner.nextInt();
                
        } else if (valor == 1) {
            
            System.out.println("1.- Administrar peliculas");
            System.out.println("2.- Administrar usuarios");
            System.out.println("0.- Salir");
            System.out.println("---------------------------");
            System.out.print("Option: ");
            opcionadmin = scanner.nextInt();

        }       
    }


    public static void buildUserMenu() {

        do {

            switch (opcionuser) {
                case 0:
                    
                buildMainMenu();
            
                case 1:
                    
                    System.out.println("1.- Casablanca");
                    System.out.println("2.- El padrino");
                    System.out.println("0.- Volver");
                    System.out.println("---------------------------");
                    System.out.print("Option: ");
                    opcionuser = scanner.nextInt();

                    break;
            
                case 2:

                    System.out.println("1.- Cambiar nombre de usuario");
                    System.out.println("2.- Canviar password");
                    System.out.println("0.- Volver");
                    System.out.println("---------------------------");
                    System.out.print("Option: ");
                    opcionuser = scanner.nextInt();
                    
                    break;
            
                default:
                    break;
            }
        } while (opcionuser != 0);
    }

    public static void buildAdminMenu() {
        
        do {
            
            if (opcionadmin == 1) {

                while (opcionadmin != 0) {          

                System.out.println("1.- Administrar películas");
                System.out.println("2.- Modificar películas");
                System.out.println("3.- Borrar películas");
                System.out.println("0.- Volver");
                System.out.println("---------------------------");
                System.out.print("Option: ");
                opcionadmin = scanner.nextInt();
                }
                
            } else if (opcionadmin == 2) {

                while (opcionadmin != 0) {       

                System.out.println("1.- Añadir usuario");
                System.out.println("2.- Borrar usuario");
                System.out.println("0.- Volver");
                System.out.println("---------------------------");
                System.out.print("Option: ");
                opcionadmin = scanner.nextInt();
                }
                
            } 



        } while (opcionadmin != 0);


    }
}
