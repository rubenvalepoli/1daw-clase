import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<String, Integer> diccionario = new HashMap<String, Integer>();
        int valor;

        diccionario.put("Pablo", 24);    
        diccionario.put("Pepe", 18);    
        diccionario.put("Hector", 8);    
        diccionario.put("Raul", 9);
        
        for (String clave : diccionario.keySet()){

            valor = diccionario.get(clave);
            System.out.println(clave + ":" + valor);
        }

    }
}