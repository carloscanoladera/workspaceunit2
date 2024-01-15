package recursividad;

import java.util.Scanner;

public class FactorialDeCola {

	static long factorial(long n) {

		//
		if (n == 0)
			return 1;

		else
			return n * factorial(n - 1);
	}

	static long factorialOverflow(long n) {
		// Puede causar overflow
		//
		if (n == 100)
			return 1;

		else
			return n * factorialOverflow(n - 1);
	}

	private static long factorialDeColaAux(long n, long acumulador) {

		if (n == 0)
			return acumulador;
		else
			return factorialDeColaAux(n - 1, n * acumulador);

	}
	
	public static long factorialDeCola(long n) {
		
		return factorialDeColaAux(n,1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num; // número introducido por el usuario
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número para calcular el factorial: ");
		num = sc.nextInt();

		System.out.println(factorial(num));

		System.out.println(factorialDeCola(2));
	}

}
