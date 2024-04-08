package estudiando;

public class Conductor {

    String nombre;
    Coche cocheasignado;

    public void cocheasignado (Coche coche){

        if (coche != null){
            cocheasignado = coche;
        } else {
            cocheasignado = null;
        }

    }

    public void mostrarcocheasignado(){

        if (cocheasignado == null){

            System.out.println(String.format("%s no tiene asignado ningun coche", nombre));
        } else {
            System.out.println(String.format("El coche asignaso a %s %s", nombre, cocheasignado.toString()));
        }

    }


    public void eliminarcocheasignado(){



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
