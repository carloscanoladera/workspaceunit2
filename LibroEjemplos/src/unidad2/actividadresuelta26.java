package unidad2;

import java.util.Scanner;

public class actividadresuelta26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in) ; 
		System.out.println("Introduzca un número:"); 
		int n1 = sc.nextInt() ; 
		System.out.println ("Introduzca Otro número:"); 
		int n2 = sc.nextInt() ; 
		if (n1 == n2) {
		System.out.println("Los numero son  iguales") ; 
		} else { 
		// si no iguales podemos decidir cuál es eI mayor 
		
			if (n1 >n2) {
				
				System.out.println(n1 +" es mayor que " + n2) ; 
			} else {
				
				System.out.println(n1 +" es menor que " + n2) ; 
			}
			
		}


	}
}
