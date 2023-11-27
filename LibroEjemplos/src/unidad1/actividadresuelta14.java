package unidad1;

import java.util.Scanner;

/*
 * Escribir una aplicación que pida eI año actual y el de nacimiento del usuario. Debe calcu- 
lar su edad, suponiendo que en el año en curso el usuario ya ha cumplido años. 

 *  */

public class actividadresuelta14 {

	
	public static void main(String[] args) { 	
	
	int aActua1; //año en curso (actual) 
	int aNacimiento; //año de nacimiento 
	int edad; 
	Scanner sc = new Scanner (System.in) ; 
	// leemos los datos 
	System.out.println( "Año de nacimiento: "); 
	
	aNacimiento= sc.nextInt( ) ; 
	System.out.println( "Año de nacimiento: ");  
	aActua1 =  sc.nextInt() ; 
	edad = aActua1 - aNacimiento; //calculamos la edad 

	System.out.println( "La edad es: " + edad);  		
	}

}
