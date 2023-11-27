package unidad2;

import java.util.Scanner;

public class actividadresuelta210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System. in) ; 
		System.out.println( "Introduzca una nota:"); 
		int nota = sc.nextInt(); 
		switch (nota) { 
		case 0, 1, 2, 3, 4 -> 
		System.out.println("Insuficiente") ; 
		case 5  ->
		System.out.println("Aprobado") ;  
		case 6 ->
		System.out.println("Bien") ;  
		case 7, 8 -> 
		System.out.println("Notable") ;  
		case 9, 10 -> 
		System.out.println("Sobresaliente") ; 
		default -> 
		System.out.println("Nota no valida") ; 
		}
		
		
	}

}
