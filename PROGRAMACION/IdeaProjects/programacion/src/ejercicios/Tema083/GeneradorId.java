package ejercicios.Tema083;
import java.util.UUID;

public class GeneradorId {

    private static GeneradorId instancia;


    private GeneradorId() {

    }

    public static GeneradorId getinstancia(){

        if (instancia == null){
            instancia = new GeneradorId();
        }
        return instancia;
    }

    public UUID getUuid(){return UUID.randomUUID();}
}
