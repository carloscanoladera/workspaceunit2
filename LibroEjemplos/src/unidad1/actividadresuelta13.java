package unidad1;

import java.util.Scanner; 
/*Pedir al usuario su edad y mostrar la que tendrá el próximo año. 
Solución */ 

/* En el ejercicio realizamos las tres fases típicas de cualquier aplicación: 
Entrada de datos: pedimos la edad 
Procesado: en este caso incrementar la edad en I 
Salida de datos: mostrar los resultad */


public class actividadresuelta13 {
	
	public static void main(String[] args) { 
		
		int edad; //aqui guardaremos la edad del usuario 
		Scanner sc = new Scanner (System. in) ; 
		System.out.print ( "Escriba su edad: "); 
		edad  = sc.nextInt(); 
		edad = edad + 1;
		// eI año que viene tendrá un año más 
		// la línea anterior puede sustuirse por: ; 
		// ahora mostraremos el valor de la variable edad 
		System.out.println ("EI próximo año su edad será "  + edad + " años"); 

		
	}

}
