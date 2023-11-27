package unidad2;

import java.util.Scanner;

public class actividadresuelta23 {
	
	/* pedir dos numeros enteros y decir si son iguales o no */
	
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in) ; 
		
		System.out.print ("Introduzca un número: " ) ; 
		int n1 = sc.nextInt() ; 
		System.out.println ("Introduzca otro número:") ; 
		int n2 = sc.nextInt();
		// ei caso donde arabos números son iguales no se contempla e imprimiría 
		// en pantalla que n2 es mayor que 
		if (n1 > n2) { 
		System.out.println(n1 + " es mayor que " + n2) ;
		} else { 
		System.out . println (n2 + " es mayor que " +n1) ;
		}

		
		
	}

}
