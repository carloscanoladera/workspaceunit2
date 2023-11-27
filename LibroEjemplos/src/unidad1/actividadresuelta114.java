package unidad1;

import java.util.Scanner;


/*alizar un programa que pida como entrada un número decimal y 10 muestre redondea 
do al entero más próximo.*/

//Cuando se importan múltiples clases de un mismo paquete, en lugar de escribir 
//un import para cada clase, existe la opción de usar : 
//que importa las clases necesarias de java. util 
/*
Redondear un número decimal significa aproximarlo a1 entero más cercano. 
Para ello, 10 que haremos será sumar O . 5 y truncar (eliminar los decimales) 
el resultado. Asi los números: 
2.3 se redondea a 2 
se redondea a 5 */ 


public class actividadresuelta114 {
	
	public static void main(String[] args) {
		
		double n; // aquí guardamos el número decimal introducido por el usuario 
		int redondeo; //utilizamos esta variable para truncar 105 decimales 
		Scanner sc = new Scanner (System.in);
	
		//en lugar de corna punto para 
		System.out.print ( "Escriba un número decimal (con punto) ");
		n = sc.nextDouble () ; 
		// ahora redondearemos n 
		redondeo = (int) (n + 0.5); 
		//convertimos un real en un entero- 
		 
		// Esta es una conversión por estrechamiento, por 10 tanto estamos 
		//obligados a aplicar un cast (int) . En caso de no hacerlo eI 
		System.out.println( n + " redondeado es	" + redondeo) ; 

		
		
	}

}
