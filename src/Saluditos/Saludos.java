package Saluditos;

import java.util.Scanner;

public class Saludos {
	public static void main(String[] args) {

		System.out.println("Buenos días Ceinmark, Soy Jacobo Sanjurjo");

		Scanner ent = new Scanner(System.in);

		System.out.print("Ingresa un número");

		int numero = ent.nextInt();
		boolean esPrimo = true;

		if (numero <= 1) {
			esPrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		if (esPrimo) {
			System.out.println(numero + " es un número primo.");
		} else {
			System.out.println(numero + " no es un número primo.");
		}

		System.out.print("Divisores de " + numero + ": ");
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}