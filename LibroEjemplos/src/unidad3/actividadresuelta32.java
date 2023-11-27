package unidad3;

import java.util.Scanner;

public class actividadresuelta32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ; 
		int sumaEdades = 0; // acumulará la suma de todas las 
		 
		int contadorA1umnos=0;  //contador de alumnos (o de 
		int contadorMayorEdad = 0;
		double media;
		System.out.print("Introduzca edad: ");
		int edad= sc.nextInt();
		while (edad >= 0) {
			
			sumaEdades+=edad;
			contadorA1umnos++;
			
			if (edad>= 18) {
				
				contadorMayorEdad++;
			}
			
			System.out.print("Introduzca edad: ");
			edad= sc.nextInt();
						
		}
		media = (double) sumaEdades/contadorA1umnos;
		
		System.out.println("Suma de todas las edades: " + sumaEdades);
		System.out.println("Media: " + media);
		System.out.println("Numero total de alumnos: " + contadorA1umnos);
		System.out.println("Mayores de edad: " + contadorMayorEdad);
		
	}

}
