package entrega1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Inicializamos variables
		double metros, centimetros; 
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos distancia
		System.out.println("Introduce la distancia en metros: ");
		metros = sc.nextDouble();
		
		// Calculamos centimetros
		centimetros = metros * 100;
	
		// Escribimos el resultado quitando los centimetros de los decimales
		System.out.println("El lanzamiento ha sido de " + (int) centimetros + " cm");
		
		// Cerramos el escaner
		sc.close();
	}

}
