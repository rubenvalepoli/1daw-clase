package ejercicios.tema08.ejercicio01;

public class Conductor {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private Coche cocheasignado;

    Conductor (){
        this.nombre = nombre;
    }

    public void cocheasignado (Coche coche) {
        if (coche != null) {
            cocheasignado = coche;
        } else {
            cocheasignado = null;
        }
    }

    public void mostrarcocheasignado() {
        if (cocheasignado == null) {
            System.out.println(String.format("%s no tiene asignado ningún coche", nombre));
        } else {
            System.out.println(String.format("Coche asignado a %s %s", nombre, cocheasignado.toString()));
        }
    }


    public boolean eliminarcoche(){

        if (cocheasignado == null) {
            System.out.println(String.format("%s no tiene asignado ningún coche", nombre));
            return false;
        } else {
            cocheasignado = null;
            return true;
        }
    }
}


 /*   private List<Coche> listCoches =new ArrayList<>();


    public boolean asignarcoche (int numeroBastidor, Flota flota, Flota listCoches){

FALTA ACABAR


        System.out.print(numeroBastidor);

for (Coche coche : ) {
            System.out.println("Comprobando coche");
            if (coche.getNumeroBastidor() == numeroBastidor) {
                System.out.println("Existe el coche el coche con numero de bastidor " + numeroBastidor);
                return true;

            } else if (coche.getNumeroBastidor() != numeroBastidor) {
                System.out.println("No existe el coche con numero de bastidor " + numeroBastidor);
            }
        }
        return false;


        if (flota = flota.)


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCocheasignado() {
        return cocheasignado;
    }

    public void setCocheasignado(Coche cocheasignado) {
        this.cocheasignado = cocheasignado;
    }
}
*/