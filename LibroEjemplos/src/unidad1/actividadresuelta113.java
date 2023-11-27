package unidad1;

import java.util.Scanner;

/*
 * Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas 
enteras que se solicitarán al usuario). EI programa debe mostrar la nota media del curso 
como se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en eI 
expediente académico (con decimales). 

 * 
 */
public class actividadresuelta113 {


		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int nota1, nota2, nota3; // 'variables para las notas 
			int mediaBo1etin; // la media es de tipo entero 
			double mediaExpediente ; // la media usa decimales 
			Scanner sc = new Scanner (System.in) ; 
			 
			// leemos las notas 
			
			System.out.println("Nota del primer trimestre:"); 
			
			nota1 = sc.nextInt() ; 
			 
			System.out.println("Nota del segundo trimestre:"); 
			nota2 = sc.nextInt() ; 
			System.out.println("Nota del tercer trimestre:"); 
			nota3 = sc.nextInt() ; 
			
			
			
			// calculamos la media con decimales 
			mediaExpediente = (nota1 + nota2 + nota3) / 2.0; 
			//división real 
			mediaBo1etin = (int) mediaExpediente; //convertimos un valor double en un 
			//valor int, truncando la parte decimal. 
			//por tanto, hay pérdida de información. 
			System.out.println ("Boletín de calificaciones:" + mediaBo1etin) ; 
			System.out.println ( "Expediente académico: " + mediaExpediente); 
			
			

		

	}

}
