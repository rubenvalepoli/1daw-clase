package com.fpmislata.examen2;

import java.util.Arrays;
import java.util.List;

public class Examen2Application {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 5, 2, 3, 1, 4, 5);

		List<Integer> distinctNumbers = numeros.stream()
				.distinct()
						.toList();

		// Mostramos el resultado por pantalla
		System.out.println("La diferencia: " + distinctNumbers);
	}
}

