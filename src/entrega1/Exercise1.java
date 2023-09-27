package entrega1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Inicializamos las variables
		double num;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce el número: ");
		num = sc.nextDouble();
		
		// Devolvemos el resultado
		System.out.println("Tu numero redondeado es: " + (int)(num + 0.5));

		// Cerramos escaner
		sc.close();
	}

}
