package com.fpmislta.excepciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExcepcionesApplication {

	public static void main(String[] args){
		//SpringApplication.run(ExcepcionesApplication.class, args);
		Scanner reader = new Scanner(System.in);

		/*EJERCICIO 2D*/

		System.out.print("introduce la edad: ");
		int edad = reader.nextInt();
		verificarEdad(edad);
		System.out.println("Puedes pasar");

	}
	public static boolean verificarEdad(int edad){
		if (edad < 18){
			throw new RuntimeException();
		}
		return true;
	}



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



		/*EJERCICIO 2A


		System.out.print("introduce la edad: ");
		int edad = reader.nextInt();

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
		if (edad < 18){
			return false;
		}
		return true;
	} */


			/*EJERCICIO 2B

			try {
			System.out.print("introduce la edad: ");
			int edad = reader.nextInt();
			verificarEdad(edad);
			System.out.println("Puedes pasar");

			}catch (Exception e){
				System.out.println("Tienes que ser mayor de edad para pasar");
			}finally {
				reader.close();
			}


		}
		public static boolean verificarEdad(int edad) throws Exception {
			if (edad < 18){
				throw new Exception();
			}
			return true;
		}*/

		/*EJERCICIO 2C
		//Muestra un error porque no hemos importado las excepciones y da error al acceder a la variable
		//Lo podemos solucionar poniendo  throws Exception a continuacion de la funcion del main

		System.out.print("introduce la edad: ");
		int edad = reader.nextInt();
		verificarEdad(edad);
		System.out.println("Puedes pasar");

	}
	public static boolean verificarEdad(int edad) throws Exception {
		if (edad < 18){
			throw new Exception();
		}
		return true;
	}*/

		/*EJERCICIO 2D

		System.out.print("introduce la edad: ");
		int edad = reader.nextInt();
		verificarEdad(edad);
		System.out.println("Puedes pasar");

	}
	public static boolean verificarEdad(int edad){
		if (edad < 18){
			throw new RuntimeException();
		}
		return true;
	}*/