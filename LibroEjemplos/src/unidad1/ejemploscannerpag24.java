package unidad1;

import java.util.Scanner;

public class ejemploscannerpag24 {
	
	

		public static void main (String[] args) { 
		int num; //en la variable num guardaremos el número que se introduzca 
		System.out.print ( "Escriba un número: " ) ; //salida por consola: mensaje 
		Scanner sc =new Scanner(System.in) ; 
		// entrada pc: consola 
		num = sc.nextInt(); 
		// ahora mostraremos de la variable num 
		System.out.println ("Valor introducido:"	+ num); //salida: mensaje + 
		// 'variable. Utilizando + podemos concatenar en la salida por consola 
//		// 'tantos mensajes y variables corno necesitemos 
		}
}
