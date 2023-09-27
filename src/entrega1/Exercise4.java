package entrega1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// Inicializamos variables
		int base, altura;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos los dos valores
		System.out.println("Introduce la base: ");
		base = sc.nextInt();
		
		System.out.println("Introduce la altura: ");
		altura = sc.nextInt();
		
		// Escribimos el resultado
		System.out.println("El area es: " + ((double) base * (double) altura / 2));
		
		// Cerramos el escaner
		sc.close();
	}

}
