package unidad1;

import java.util.Scanner;

/*
 * Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad 
(mediante un literal booleano: true o false). 

 * 
 */

public class actividadresuelta18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in) ; 
		System.out.println( "Escriba edad " ) ; 
		int edad = sc.nextInt();
		boolean mayorEdad = edad>= 18;
		 
		System.out.println ( "Mayoría de 	edad: " + mayorEdad) ; 
		// Iser mayor de edad implica que la 
		//edad sea mayor o igual que 18 
 
 


	}

}
