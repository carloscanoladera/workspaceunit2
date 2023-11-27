package unidad1;

import java.util.Scanner;


/*Escribir un programa que pida un número al usuario y 
 * muestre su valor absoluto. /* 
 

/ * Dado un número, para calcular su valor absoluto solo tenemos que saber si es 
* negativo, cuyo caso es necesario multiplicarlo por -I, que se 
* consigue el mismo valor pero con signa positivo.*/ 

public class actividadresuelta111 {
	
	public static void main(String[] args) {
		
		final double PRECIO_MANZANAS = 2.35; //valores constantes, no varia 
		// el programa 
		final double PRECIO_PERAS = 1.95; 
		//log identificadores de constantes los escribimos en mayúsculas 
		int vManz1Sem, vManz2Sem; //ventas (en kilos) por semestre 
		int vPeras1Semr, vPeras2Sem; // igual para las peras 
		double impTota1; // importe total 
		Scanner sc =new Scanner (System.in) ; 
		// pedimos los datos 
		System.out.println ( "Para las manzanas "); 
		System.out.println ( "Ventas en kilos del primer semestre"); 
		vManz1Sem = sc.nextInt() ; 

		System.out.println ( "Ventas en kilos del segundo semestre"); 
		vManz2Sem = sc.nextInt() ; 
		
		
		// pedimos los datos 
		System.out.println ( "Para las peras "); 
		System.out.println ( "Ventas en kilos del primer semestre"); 
		vPeras1Semr = sc.nextInt() ; 

		System.out.println ( "Ventas en kilos del segundo semestre"); 
		vPeras2Sem = sc.nextInt() ; 
		
		impTota1 = (vManz1Sem + vManz2Sem) * PRECIO_MANZANAS; 
		impTota1 += (vPeras1Semr +vPeras2Sem) * PRECIO_PERAS ; 
		System.out.println( "importe total es de: " + impTota1 + " euros");
	}

}
