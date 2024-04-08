package com.fpmislta.excepciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExcepcionesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ExcepcionesApplication.class, args);

		Scanner reader = new Scanner(System.in);

		int edad;

		System.out.print("introduce la edad");
		edad = reader.nextInt();

		try {
			if (verificarEdad(edad)){
				System.out.println("puede pasar");
			}else{
				System.out.println("No puede pasar");

			}
		}catch (Exception e){
			System.out.println("Algo salio mal");
		}finally {
			reader.close();
		}


	}
	public static boolean verificarEdad(int edad) {
		return edad > 18;
	}









/*	EJERCICIO 1A Y 1B

	int multiplicado, dos;

	dos = 2;

		try {
			System.out.print("Escribe un numero para multipliacarlo por 2: ");
			multiplicado = reader.nextInt();
			System.out.println("Resultado: " + (multiplicado * dos));
		} catch (Exception e){
			System.out.println("Algo ha salido mal");
		}finally {
			reader.close();
		}
	}*/

}
