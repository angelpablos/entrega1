package entrega1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Inicializamos variables
		int inputSegundos;
		
		// Inicializamos variables de resultado
		int horas, minutos, segundos;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos los segundos
		System.out.println("Introduce los segundos: ");
		inputSegundos = sc.nextInt();
		
		// Calculamos las horas, minutos y segundos
		horas = inputSegundos / 3600;
        minutos = (inputSegundos % 3600) / 60;
        segundos = inputSegundos % 60;
        
        // Escribimos el resultado
        System.out.println("El resultado es: " + horas + (horas > 1 ? " horas, " : " hora, ") + minutos + " minutos, " + segundos + " segundos");
		
		// Cerramos el escaner
		sc.close();
	}

}
