package entrega1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num1, num2;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos los dos numeros
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		// Escribimos el resultado
		System.out.println("Son iguales: " + (num1 == num2));
		

		// Cerramos el escaner
		sc.close();
	}

}
