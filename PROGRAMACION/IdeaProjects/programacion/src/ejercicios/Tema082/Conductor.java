package ejercicios.Tema082;

import ejercicios.Tema082.Coche;

public class Conductor {
    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private ejercicios.Tema082.Coche cocheasignado;

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
