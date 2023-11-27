package unidad2;
import java.util.Scanner;
public class actividadresuelta21 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in) ; 
	int num; // número introducido por el usuario 
	System.out.println ( "Introduzca un número: ") ; 
	num = sc .nextInt(); 
	 
	if (num % 2 == 0)  { //si num es par 
		System.out.println("El numero " + num + "es par") ;
	} else 	{ // es impar 
		System.out.println("El numero " + num + "es impar") ; 
			
	}
	}
}
