package unidad1;

import java.util.Scanner;

/*
 * 
 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que in- 
fluirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. Solo po- 
eremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una 
opción en la que, indistintamente de 10 anterior, podremos salir a la calle: el hecho de que 
tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.). Solici- 
tar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir 
a la biblioteca. EI algoritmo debe mostrar mediante un booleano (true o false) si es po- 
sible que se le otorgue permiso para ir a la calle. 

 */

public class actividadresuelta110 {

	public static void main(String[] args) {

	 
		boolean llueve, finalizadoTareas, irBib1ioteca; 
		 
		Scanner sc = new Scanner (System.in);
		System.out.println ("¿Está lloviendo? (true/ false) " );

		llueve = sc.nextBoolean();
		System.out.println("¿Has finalizado la tarea? (true/false)");
		finalizadoTareas = sc.nextBoolean();
		System.out.println("¿Tienes que salir a la biblioteca? (true/false)");
		irBib1ioteca = sc.nextBoolean();
		boolean salir = !llueve &&finalizadoTareas || irBib1ioteca;
		System.out.println("Puedes salir: " + salir);
		
		
	}
	
}
