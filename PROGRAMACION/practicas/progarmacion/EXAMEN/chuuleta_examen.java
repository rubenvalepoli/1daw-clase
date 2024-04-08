/* APUNTES JAVA 1ºEVALUACIÓN */

/* Pasar de entero a decimal */

class cast
{
    public static void main(String[] args)
    {
        int a = 5;
        double b;

        b = (double) a;
        System.out.println(b);

    }
}

/* PARA QUITAR LOS ESPACIOS Y PONE TODO EN MAYUSCULAS */

class espacios {

    public static void main(String[] args) {
        final String cadena = "     hola mundo     ";

        System.out.println(cadena.trim().toUpperCase());
    }

}

/* METODOS DE STRING */

    /* PARA DEVOLVER LA CANTIDAD DE CARACTERES */

    f = "Hola mundo";
    System.out.println(f.length());

    /* PARA DEVOLVER LA POSICION EN QUE ESTAN LOS CARACTERES */
    f = "Hola mundo";
    System.out.println(f.charAt(3));

    /* COMPARA DOS CADENAS PARA VER SI SON IGULAES */

    String g = "Hola mundo";
    System.out.println(f.equals(g));
    String h = "Hola universo";
    System.out.println(f.equals(h));

/* IF */

class SentenciaIf {
     
    public static void main(String[] args) {
        int number = 3;
 
        if(number<5) {
            System.out.println("El número es menor que 5");
        }
        System.out.println("Fin del programa");
    }
}

/* IF ELSE */

    if(number<5) 
    {
        System.out.println("El número es menor que 5");
    } else {
        System.out.println("El número es mayor o igual que 5");
    }

/* SWITCH */

    switch (key) {
    case value:
                 
        break;
         
    default:
        break;
    }

/* OPERADOR TERNARIO */

    variable = (condición)?valor_si_verdader:valor_si_falso;
    frase = (a<5)? "El número es menor que 5": "El número es mayor que 5";

/* WHILE */

    class SentenciaWhileDo {
 
        public static void main(String[] args) {
            int number = 1;
    
            while (number < 10) {
                System.out.println(number);
                number++;
            }
        }
 
    }

/* DO - WHILE */

    class SentenciaDoWhile {
 
        public static void main(String[] args) {
            int number = 1;
    
            do {
                System.out.println(number);
                number++;
            } while (number < 10);
        }
    }

/* FOR */

    class SentenciaFor {
 
    public static void main(String[] args) {
        for (int number = 1; number < 10; number++) {
            System.out.println(number);
        }
    }
 
/* BUCLESA ANIDADOS CON FOR */

    for(int i=1; i<10; i++) {
        for(int j=1; j<10;j++) {
            System.out.println(i + "*" + j + "=" + (i*j));
        }
    }


/* DECLARAR VARIABLE GLOBAL */

    static int resultado = 10;

/* LLAMAR A UNA FUNCION */

    class LlamadaFuncion {
 
        static int add(int number1, int number2) {
            return number1 + number2;
        }
    
        public static void main(String[] args) {
            int a = 2;
            int b = 3;
            int result;
    
            result = add(a, b);
            
        }
 
    }

/* RECURSIVIDAD */
    class Recursividad {
 
        static int factorialIterativo(int number) {
            int factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
        
        public static void main(String[] args) {
            int a = 5;
    
            System.out.println(factorialIterativo(a));
        }
    }


/* ARRAYS */

    /* DECLAR Y DEFINIR UN ARRY */

        int[] numbers = new int[10];

    /* SABER EL TAMAÑO DEL ARRAY */

        System.out.println(numbers.length);
    
    /* RELLENAR LOS VALORES DE UN ARRAY */

        /* 1ºMETODO */
    
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 3;
            }
        
        /* 2º METODO */

            int[] numbers = {1, 3, 312, 15, 69, 7, 8, 9, 0, 1};

    /* ACCEDER A LOS ELEMENTOS DE UN ARRAY */

        for (int elemento : numbers) {
        System.out.println(elemento);    
    }

    /* HACER UN ARRAY CON LOS DATOS Y ACCEDER A ELLOS */

           public static void main(String[] args) {
            
            int[] numbers = {1, 2, 3, 4, 5};

            for (int element : numbers) {
                System.out.println(element);
            }
    }


    /* INICIAR ARRAY MULTIDIMENSIONAL */

        int [][] m = new int[5][5];

    /* INICIALIZAR UN ARRAY MULTIDIMENSIONAL */

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = j + 1;
            }  
        }
    

/* CONJUNTO */

    Set<Integer> conjunto = new HashSet<>();

        conjunto.add(2);
        conjunto.add(10);
        conjunto.add(3);
        conjunto.add(23);
        conjunto.add(99);
        conjunto.add(10);

        if(!conjunto.add(10)) {
            System.out.println("El número ya está en la lista");
        }


        for (Integer number : conjunto) {
            System.out.println(number);
        }

/* LISTAS */

    List<Integer> lista = new ArrayList<>();
 
 
        lista.add(1); // Añade un elemento al final de la lista.
        lista.add(3); // Añade otro elemento al final de la lista.
        lista.add(1,2); // Añade en la posición 1 el elemento 2.
        lista.add(lista.get(1)+lista.get(2)); // Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.
        lista.remove(0); // Elimina el primer elementos de la lista.
        for (Integer elemento: lista)
            System.out.println("Elemento:" + elemento); // Muestra la lista.
        }

/* MAPS */

    Map<String, Integer> diccionario = new HashMap<String, Integer>();
    int valor;
    
    diccionario.put("edad", 18); //añadimos el par clave = "edad" / valor = 18 
    diccionario.put("año", 2022); //añadimos el par clave = "año" / valor = 2022
    diccionario.put("edad", 34); //Sustituimo el valor de la clave "edad"
    
    //Recorremos el HashMap y mostramos las claves y los valores
    for (String clave : diccionario.keySet()) { 
        valor = diccionario.get(clave);
        System.out.println(clave + ": " + valor);
    }







