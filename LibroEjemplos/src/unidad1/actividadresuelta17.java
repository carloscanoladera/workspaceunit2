package unidad1;

import java.util.Scanner;

/*
 * Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el 
usuario debe introducir el radio (que puede contener decimales). 
 */

public class actividadresuelta17 {
	
	public static void main(String[] args) {
		
		double radio; //el radio puede contener decimales 
		double area, longitud; 
		Scanner sc = new Scanner (System. in) ; 
		// usaremos decimales con 
		// pedimos los datos 
		System.out.print ( "Escriba el radio: " ) ; 
		radio = sc.nextDouble() ; 
		 // la clase Math pertenece a1 paquete 
		longitud = 2 * Math.PI * radio; 
		// java. lang, gue se importa por defecto 
		area=  Math.PI * Math.pow(radio, 2); //Math.pow(base, exponente) eleva la base 
		// al exponente utilizado. Math.pow(radia, 2) eleva eI radio a 2 (a1 cuadrado) 
		System.out.println ( "La longitud de la circunferencia es: " + longitud) ; 
		System.out.println ("EI área del círculo es 	:" + area) ; 
		
		
	}

}
