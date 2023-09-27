package entrega1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num, resto, sumaNecesaria;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce el numero: ");
		num = sc.nextInt();
		
		// Calculamos el resto y la suma para llegar el multiplo será 7 menos el resto
		resto = num % 7;
		sumaNecesaria = 7 - resto;
		
		// Escribimos el resultado
		System.out.println("A el numero " + num + " hay que sumarle " + (sumaNecesaria != 7 ? sumaNecesaria : 0) + " para que sea multiplo de 7");
		
		// Cerramos escaner
		sc.close();
	}

}
