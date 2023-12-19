package ejercicios.Tema083;
import java.util.UUID;

public class GeneradorId {

    private static GeneradorId instancia;
    private String id;

    private GeneradorId() {
        this.id = UUID.randomUUID().toString();
    }

    public static GeneradorId getinstancia(){

        if (instancia == null){
            instancia = new GeneradorId();
        }
        return instancia;
    }

    public String getId(){
        return id;
    }
}
