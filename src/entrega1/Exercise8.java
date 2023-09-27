package entrega1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// Inicializamos constantes
		final double PRECIO_ADULTO = 20;
		final double PRECIO_INFANTIL = 15.5;
		
		// Inicializamos variables
		int entradasAdulto, entradasInfantil;
		
		// Inicializamos variable de resultado
		double resultado;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos las entradas
		System.out.println("Introduce el numero de entradas de adulto: ");
		entradasAdulto = sc.nextInt();
		
		System.out.println("Introduec el numero de entradas infantiles: ");
		entradasInfantil = sc.nextInt();
		
		// Calculamos resultado
		resultado = entradasAdulto * PRECIO_ADULTO + entradasInfantil * PRECIO_INFANTIL;
		
		// Escribimos el precio total en pantalla, teniendo en cuenta el descuento si aplica:
		System.out.println("El precio a pagar es: " + (resultado > 100 ? resultado - (resultado * 0.05) : resultado));
		
		// Cerramos el escaner
		sc.close();
	}

}
