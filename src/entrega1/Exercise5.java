package entrega1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int a, b, c, x;
		int solucion;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los tres coeficientes
		System.out.println("Introduce el primer coeficiente (a): ");
		a = sc.nextInt();
		
		System.out.println("Introduce el segundo coeficiente (b): ");
		b = sc.nextInt();
		
		System.out.println("Introduce el tercer coeficiente (c): ");
		c = sc.nextInt();
		
		// Pedimos el valor de x
		System.out.println("Introduce el valor de x: ");
		x = sc.nextInt();
		
		// Calculamos la solución
		solucion = a*(x*x)+b*x+c;
		
		// Escribimos la solucion
		System.out.println("El resultado es: " + solucion);
	}

}
