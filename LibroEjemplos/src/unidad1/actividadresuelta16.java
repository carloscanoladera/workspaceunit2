package unidad1;
import java.util.Scanner; 

/*Crear una aplicación que calcule la media aritmética de dos notas enteras, Hay que t 
en cuenta que la media puede contener decimales. */

 
/* pediremos y La COt1iO la media puede 
tener decimales utilizaremos una variable de tipo real. */ 



public class actividadresuelta16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int notal, nota2; //variables enteras para las natas 
		double media; // la media puede contener decimales: usamog double 
		Scanner sc = new Scanner(System.in) ; 
		
		
		// leemos las notas
		System.out.println("Introduce la Nota 1:");
		
		notal= sc.nextInt(); 
		System.out.println("Introduce la Nota 2:");
		nota2 = sc.nextInt(); 
		// calculanos la media 		media 
		media = (notal + nota2 ) / 2.0; 
		//en la expresión, el punto decimal de 2.0 hace que no sea una divisi6n entera. 
		// EI numerador sufre una conversión automática a real en doble precisión y el 
		//resuLtado conserva la parte decimal 
		System.out.println("La nota media es: " + media) ; 

		

	}

}
