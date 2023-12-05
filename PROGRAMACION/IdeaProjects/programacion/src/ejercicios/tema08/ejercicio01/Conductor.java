package ejercicios.tema08.ejercicio01;

public class Conductor {
    private String nombre = "pepe";
    private Coche cocheasignado;

    public boolean asignarcoche (int numeroBastidor, Flota flota, Flota listCoches){

        /*FALTA ACABAR*/

        for (Coche coche : listCoches) {
            System.out.println("Comprobando coche");
            if (coche.getNumeroBastidor() == numeroBastidor) {
                System.out.println("Existe el coche el coche con numero de bastidor " + numeroBastidor);
                return true;

            } else if (coche.getNumeroBastidor() != numeroBastidor) {
                System.out.println("No existe el coche con numero de bastidor " + numeroBastidor);
            }
        }
        return false;


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
