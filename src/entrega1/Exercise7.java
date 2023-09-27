package entrega1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// Inicializamos variables del usuario
		int mm, cm, m;
		
		// Inicializamos resultado
		double suma;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos las tres variables
		System.out.println("Introduce los milimetros: ");
		mm = sc.nextInt();
		
		System.out.println("Introduce los centimetros: ");
		cm = sc.nextInt();
		
		System.out.println("Introduce los metros: ");
		m = sc.nextInt();
		
		// Calculamos la suma
		suma = (m * 100) + ((double) mm / 10) + cm;
		
		// Imprimimos el resultado
		System.out.println("El resultado es: " + suma + "cm");

		// Cerramos el escaner
		sc.close();
	}

}
