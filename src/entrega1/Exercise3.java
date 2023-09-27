package entrega1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// Inicializamos los numeros
		int num1, num2;
		
		// Inicializamos otras variables
		int resto, sumaNecesaria;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();
		
		// Pedimos el segundo numero
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		// Calculamos el resto de los dos numeros y la suma necesaria será el segundo numero menos el resto
		resto = num1 % num2;
		sumaNecesaria = num2 - resto;
		
		// Escribimos el resultado
		System.out.println("A el numero " + num1 + " hay que sumarle " + (sumaNecesaria != num2 ? sumaNecesaria : 0) + " para que sea multiplo de " + num2);
		
		// Cerramos escaner
		sc.close();
	}

}
