/* MOSTRAR LOS NUMEROS PARES HASTA EL 100 POR PANTALLA */

    int number = 0;
        if (number % 2 == 0) {
                
            do {

                number= number +2;
                System.out.print(number + " ");

            } while (number < 100);
        }

/* MOSTRAR LOS NUMEROS PARES HASTA EL NUMERO QUE EL SUSARIO PONGA POR PANTALLA */

    System.out.print("Pon un numero para acabar: ");
        int end = scanner.nextInt();
        int number = 0;
        
        if (number % 2 == 0) {
                
            do {
                System.out.print(number + " ");
                number= number +2;

            } while (number <= end);
        }

/* MAP PARA MOSTRAR LOS MAYORES DE EDAD */

    Map<String, Integer> diccionario = new HashMap<String, Integer>();
        int value;

        diccionario.put("Gema", 48);
        diccionario.put("Ruben", 17);
        diccionario.put("Sole", 21);
        diccionario.put("Hector", 10);

        for (String key : diccionario.keySet()){
            value = diccionario.get(key);

            if (value >= 18) {
                System.out.print(key + " " );
            } 
        }

/* MATRIZ CON NUMEROS ALEATORIOS Y EN PERPENDICULAR 1  */

    int [][] matriz = new int [6][6];
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++){
            matriz[i][i] = 1;
            for (int j = 0; j < matriz[i].length; j++){
                if (i < j){
                    matriz[i][j] = aleatorio.nextInt(0, 4) * 2 + 2;
                } else if (i > j) {
                    matriz[i][j] = aleatorio.nextInt(0,4) * 2 + 3;
                }                
            }
        }

        for (int[] row : matriz) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

/* CIFRAR TEXTO */

    String palabra;
        int a = 0;
        char caracter;
        String abecedario = "abcdefghijklmnopqrstuvwxyzabc";

        System.out.println("Escribe la palabra que quieres cifrar: ");
        palabra = scanner.nextLine();
        while (a <palabra.length()) {
            caracter = palabra.charAt(0 + a);
            int b = abecedario.indexOf(caracter);
            System.out.print(abecedario.charAt(b + 3));
            a++;
        }
        System.out.println("");

/* MOSTRAR UNA FRASE TODA EN MINUSCULAS Y SIN ESPACIOS */

    String text = "      Voy A ApROBar     ";

    System.out.println(text.trim().toLowerCase());


    